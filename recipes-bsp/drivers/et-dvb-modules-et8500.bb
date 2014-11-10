KV = "3.14.21"
SRCDATE = "20141110"

require et-dvb-modules.inc

SRC_URI = "http://xtrendet.net/${MACHINE}-drivers-${KV}-${SRCDATE}.zip"

SRC_URI[md5sum] = "939bc906581c631463e2b16ae70fbf4e"
SRC_URI[sha256sum] = "f25c4d8925665a8fa1ca375aef745e191ffb2144fb4d7a2e429e438c74327f72"

COMPATIBLE_MACHINE = "et8500"
