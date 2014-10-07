DESCRIPTION = "Utils for DVB-S blindscan"
SECTION = "base"
PRIORITY = "optional"
LICENSE = "CLOSED"

SRC_URI = "http://www.xtrendet.net/enigma2-plugin-systemplugins-blindscan_1.4_mipsel.zip"

PROVIDES += "virtual/blindscan-dvbs"
RPROVIDES_${PN} += "virtual/blindscan-dvbs"

PV = "1.0"
PR = "r5"

S = "${WORKDIR}"

do_compile() {
}

do_install() {
	install -d "${D}/${bindir}"
	install -m 0755 "${S}/usr/bin/avl_xtrend_blindscan" "${D}/${bindir}"
}

INHIBIT_PACKAGE_STRIP = "1"

SRC_URI[md5sum] = "50E866CD0E33825260442BA39212F0EA"
SRC_URI[sha256sum] = "F854A6924E932615DD76716B94FD80221EE35382CECC630A063D5F4F5DB36A80"
