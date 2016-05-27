KV = "4.4.8"
SRCDATE = "20160527"
GCC = "4.9.1"

require et-dvb-modules.inc

SRC_URI = "http://xtrendet.net/${MACHINE}-drivers-${KV}-${GCC}-${SRCDATE}.zip"

SRC_URI[md5sum] = "abbdb6bef97da4b708c52decd26ee4fc"
SRC_URI[sha256sum] = "cf1488cfb67a808b3ce858d68a1b672b45290288ba1e72fe1046d608d7d824f7"

COMPATIBLE_MACHINE = "et7x00"
