KV = "4.4.8"
SRCDATE = "20160624"
GCC = "4.9.1"

require et-dvb-modules.inc

SRC_URI = "http://xtrendet.net/${MACHINE}-drivers-${KV}-${GCC}-${SRCDATE}.zip"

SRC_URI[md5sum] = "6227d02d7d2e95debb3bbcd4a599321e"
SRC_URI[sha256sum] = "9cccdd8a19623f16e48307510d3cc083c848808cc0a1bbb7effafb5e6e790904"

COMPATIBLE_MACHINE = "et7x00"
