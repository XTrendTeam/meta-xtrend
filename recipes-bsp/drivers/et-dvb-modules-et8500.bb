KV = "4.4.8"
SRCDATE = "20160715"
GCC = "4.9.1"

require et-dvb-modules.inc

SRC_URI = "http://xtrendet.net/${MACHINE}-drivers-${KV}-${GCC}-${SRCDATE}.zip"

SRC_URI[md5sum] = "e0f90550c1fb3a0bdfbe706685215a0f"
SRC_URI[sha256sum] = "294773a33dc9db743415f0beec22603a8bbab4d0dcf4df42b6e156b8dc84de70"

COMPATIBLE_MACHINE = "et8500"
