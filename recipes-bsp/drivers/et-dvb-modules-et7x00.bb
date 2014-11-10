KV = "3.14.21"
SRCDATE = "20141110"

require et-dvb-modules.inc

SRC_URI = "http://xtrendet.net/${MACHINE}-drivers-${KV}-${SRCDATE}.zip"

SRC_URI[md5sum] = "b473735e269a3c3b4b6efc5ba0507937"
SRC_URI[sha256sum] = "46e8100beeab954b7af862fe1f6fde84371aa5eba0d8b902e670e0cbaa72a20d"

COMPATIBLE_MACHINE = "et7x00"
