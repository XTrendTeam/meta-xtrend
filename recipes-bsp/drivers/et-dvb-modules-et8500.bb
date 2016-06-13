KV = "4.4.8"
SRCDATE = "20160610"
GCC = "4.9.1"

require et-dvb-modules.inc

SRC_URI = "http://xtrendet.net/${MACHINE}-drivers-${KV}-${GCC}-${SRCDATE}.zip"

SRC_URI[md5sum] = "7cc9ad5cdcdcd1ba306053b3b384ffbf"
SRC_URI[sha256sum] = "95865ddd8194d916c2a611be0f99e8e1a14d7efa9dd09f2b2c7436c0547a261b"

COMPATIBLE_MACHINE = "et8500"
