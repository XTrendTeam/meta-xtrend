KV = "3.14.10"
SRCDATE = "20140821"

require et-dvb-modules.inc

SRC_URI = "http://xtrendet.net/${MACHINE}-drivers-${KV}-${SRCDATE}.zip"

SRC_URI[md5sum] = "227f711781748f63726428542dcbc5c8"
SRC_URI[sha256sum] = "aae10b226ff83081e2a274f1c35f4d50f35db7f2cf43377e8a4b85a99657eda9"

COMPATIBLE_MACHINE = "et7x00"
