KV = "4.4.8"
SRCDATE = "20160812"
GCC = "4.9.1"

require et-dvb-modules.inc

SRC_URI = "http://xtrendet.net/${MACHINE}-drivers-${KV}-${GCC}-${SRCDATE}.zip"

SRC_URI[md5sum] = "c0d762aab7c28ad4a3fa16c95b0795b4"
SRC_URI[sha256sum] = "a2fe7b919b27bd79be4064b592a2e9fe8d031fb6970746e9aefd7a298d1795d8"

COMPATIBLE_MACHINE = "et7x00"
