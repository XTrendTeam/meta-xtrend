KV = "3.14.10"
SRCDATE = "20140829"

require et-dvb-modules.inc

SRC_URI = "http://xtrendet.net/${MACHINE}-drivers-${KV}-${SRCDATE}.zip"

SRC_URI[md5sum] = "4d9f31c62a13f14ee168545b775b16e2"
SRC_URI[sha256sum] = "5b449e37bcf1903104722f78a9da1eeb0462110c7e2b54ca83b73e47effb8788"

COMPATIBLE_MACHINE = "et8500"
