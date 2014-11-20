DESCRIPTION = "Utils for DVB-S blindscan"
SECTION = "base"
PRIORITY = "optional"
LICENSE = "CLOSED"

SRC_URI = "http://www.xtrendet.net/enigma2-plugin-systemplugins-blindscan_1.4_mipsel.zip"

PROVIDES += "virtual/blindscan-dvbs"
RPROVIDES_${PN} += "virtual/blindscan-dvbs"

PV = "1.0"
PR = "r7"

S = "${WORKDIR}"

do_compile() {
}

do_install() {
    install -m 0755 -d ${DEPLOY_DIR_IPK}/${MACHINE}
    install -m 0644 enigma2-plugin-systemplugins-blindscan_1.4_mipsel.ipk ${DEPLOY_DIR_IPK}/${MACHINE}
}

INHIBIT_PACKAGE_STRIP = "1"

SRC_URI[md5sum] = "50e866cd0e33825260442ba39212f0ea"
SRC_URI[sha256sum] = "f854a6924e932615dd76716b94fd80221ee35382cecc630a063d5f4f5db36a80"
