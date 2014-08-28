KV = "3.14.10"
SRCDATE = "20140828"

require et-dvb-modules.inc

SRC_URI = "http://xtrendet.net/${MACHINE}-drivers-${KV}-${SRCDATE}.zip"

SRC_URI[md5sum] = "d60fa18e0f9f71999113338a8ffeaaac"
SRC_URI[sha256sum] = "782f2536039cc59ca452c0e78e7f6f71b803d21c355e14e0e43f7f0a6c00315b"

COMPATIBLE_MACHINE = "et7x00"
