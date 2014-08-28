KV = "3.14.10"
SRCDATE = "20140828"

require et-dvb-modules.inc

SRC_URI = "http://xtrendet.net/${MACHINE}-drivers-${KV}-${SRCDATE}.zip"

SRC_URI[md5sum] = "8d1fe8a34a5566078fa553e1232423b1"
SRC_URI[sha256sum] = "407d40134596a9c1aa1d0f17344aef175c7087ab94ecbf628cce56e373d11c69"

COMPATIBLE_MACHINE = "et8500"
