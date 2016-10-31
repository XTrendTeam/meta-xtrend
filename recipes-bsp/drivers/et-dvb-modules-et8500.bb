KV = "4.4.8"
SRCDATE = "20161031"
GCC = "4.9.1"

require et-dvb-modules.inc

SRC_URI = "http://xtrendet.net/${MACHINE}-drivers-${KV}-${GCC}-${SRCDATE}.zip"

SRC_URI[md5sum] = "6c88a4cc80463b04b23c85ef95a5599e"
SRC_URI[sha256sum] = "d863265685b5e8b16c18e4cbde1c07cbd57248505939a622708bb60da74b1868"

COMPATIBLE_MACHINE = "et8500"
