KV = "3.14.21"
SRCDATE = "20141021"

require et-dvb-modules.inc

SRC_URI = "http://xtrendet.net/${MACHINE}-drivers-${KV}-${SRCDATE}.zip"

SRC_URI[md5sum] = "6785a90aca2a4a4c9534ee3bd932cd8d"
SRC_URI[sha256sum] = "9bb4b72c10ae973b1199f2360ecd4bdd6d4ec84e786e1351c357b8dff984cdac"

COMPATIBLE_MACHINE = "et7x00"
