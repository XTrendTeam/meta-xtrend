DESCRIPTION = "Linux kernel for ${MACHINE}"
SECTION = "kernel"
LICENSE = "GPLv2"

COMPATIBLE_MACHINE = "et[8,1,4]+"

KERNEL_RELEASE = "4.0.1"

SRC_URI[md5sum] = "c274792d088cd7bbfe7fe5a76bd798d8"
SRC_URI[sha256sum] = "6fd63aedd69b3b3b28554cabf71a9efcf05f10758db3d5b99cfb0580e3cde24c"

LIC_FILES_CHKSUM = "file://${WORKDIR}/linux-${PV}/COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

MACHINE_KERNEL_PR_append = ".4"

# By default, kernel.bbclass modifies package names to allow multiple kernels
# to be installed in parallel. We revert this change and rprovide the versioned
# package names instead, to allow only one kernel to be installed.
PKG_kernel-base = "kernel-base"
PKG_kernel-image = "kernel-image"
RPROVIDES_kernel-base = "kernel-${KERNEL_VERSION}"
RPROVIDES_kernel-image = "kernel-image-${KERNEL_VERSION}"

SRC_URI += "http://www.et-view.com/img_up/shop_pds/bh190/Img_Xtrend/linux-${PV}.tar.gz \
	file://defconfig \
	file://add-dmx-source-timecode.patch \
	file://iosched-slice_idle-1.patch \
	file://0001-genet1-1000mbit.patch \
	file://0001-Support-TBS-USB-drivers.patch \
	file://0002-STV-Add-PLS-support.patch \
	file://0003-STV-Add-SNR-Signal-report-parameters.patch \
	file://0001-stv090x-optimized-TS-sync-control.patch \
	file://0001-bcmgenet.patch \
	file://2-2-stv090x-on-tuning-lock-return-correct-tuned-paramaters-like-freq-sr-fec-rolloff-etc.patch \
	file://bcmgenet_phyaddr.patch \
	file://set_o32_default_fpu_flags.patch \
	file://kernel-gcc6.patch \
	"

inherit kernel machine_kernel_pr

S = "${WORKDIR}/linux-${PV}"

export OS = "Linux"
KERNEL_OBJECT_SUFFIX = "ko"
KERNEL_OUTPUT = "vmlinux"
KERNEL_IMAGETYPE = "vmlinux"
KERNEL_IMAGEDEST = "/tmp"

FILES_kernel-image = "${KERNEL_IMAGEDEST}/${KERNEL_IMAGETYPE}*"

kernel_do_install_append() {
	${STRIP} ${D}${KERNEL_IMAGEDEST}/${KERNEL_IMAGETYPE}-${KERNEL_VERSION}
	gzip -9c ${D}${KERNEL_IMAGEDEST}/${KERNEL_IMAGETYPE}-${KERNEL_VERSION} > ${D}${KERNEL_IMAGEDEST}/${KERNEL_IMAGETYPE}.gz
	rm ${D}${KERNEL_IMAGEDEST}/${KERNEL_IMAGETYPE}-${KERNEL_VERSION}
}

pkg_postinst_kernel-image () {
	if [ "x$D" == "x" ]; then
		if [ -f /${KERNEL_IMAGEDEST}/${KERNEL_IMAGETYPE}.gz ] ; then
			flash_eraseall /dev/mtd1
			nandwrite -p /dev/mtd1 /${KERNEL_IMAGEDEST}/${KERNEL_IMAGETYPE}.gz
			rm -f /${KERNEL_IMAGEDEST}/${KERNEL_IMAGETYPE}.gz
		fi
	fi
	true
}
