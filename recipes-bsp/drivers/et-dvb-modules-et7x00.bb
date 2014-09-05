KV = "3.14.10"
SRCDATE = "20140905"

require et-dvb-modules.inc

SRC_URI = "http://xtrendet.net/${MACHINE}-drivers-${KV}-${SRCDATE}.zip"

SRC_URI[md5sum] = "a336fea19b7a0daf5363de112e5451bf"
SRC_URI[sha256sum] = "3d9380381802fa2e7c4bc3c53d57792d6891dfc0a794060af366693399f1e678"

COMPATIBLE_MACHINE = "et7x00"
