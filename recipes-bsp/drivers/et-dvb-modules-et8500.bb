KV = "4.4.8"
SRCDATE = "20160705"
GCC = "4.9.1"

require et-dvb-modules.inc

SRC_URI = "http://xtrendet.net/${MACHINE}-drivers-${KV}-${GCC}-${SRCDATE}.zip"

SRC_URI[md5sum] = "612cb9275d1d0aae08897cb64ce5744e"
SRC_URI[sha256sum] = "b3322840df16c6aac3560975ed1d455159ea75667ca79a75fe49bbe64e1e1feb"

COMPATIBLE_MACHINE = "et8500"
