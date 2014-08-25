KV = "3.14.10"
SRCDATE = "20140825"

require et-dvb-modules.inc

SRC_URI = "http://xtrendet.net/${MACHINE}-drivers-${KV}-${SRCDATE}.zip"

SRC_URI[md5sum] = "60368312b871d10b4c04ef88fb23f871"
SRC_URI[sha256sum] = "70ee5f579968c905c485c1edf87fc76562e28110f2b8ae89d4914d1022f142b1"

COMPATIBLE_MACHINE = "et7x00"
