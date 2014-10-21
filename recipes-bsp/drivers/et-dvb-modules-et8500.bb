KV = "3.14.21"
SRCDATE = "20141021"

require et-dvb-modules.inc

SRC_URI = "http://xtrendet.net/${MACHINE}-drivers-${KV}-${SRCDATE}.zip"

SRC_URI[md5sum] = "831ea4b81235e9a4e51639293a425c57"
SRC_URI[sha256sum] = "52a3d0a0d5fafc647163fd7a3e532ad473953290cab7277d63bc005d6f65ed12"

COMPATIBLE_MACHINE = "et8500"
