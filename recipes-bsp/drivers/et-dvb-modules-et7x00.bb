KV = "3.14.21"
SRCDATE = "20150330"

require et-dvb-modules.inc

SRC_URI = "http://xtrendet.net/${MACHINE}-drivers-${KV}-${SRCDATE}.zip"

SRC_URI[md5sum] = "cc8ca2a8a4312eb085c3dd0805f05d81"
SRC_URI[sha256sum] = "1908c7ba4da5a9eb5137fbf75b8771753d326725ccb37ef10b633a5014aba565"

COMPATIBLE_MACHINE = "et7x00"
