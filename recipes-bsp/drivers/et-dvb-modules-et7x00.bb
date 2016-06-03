KV = "4.4.8"
SRCDATE = "20160601"
GCC = "4.9.1"

require et-dvb-modules.inc

SRC_URI = "http://xtrendet.net/${MACHINE}-drivers-${KV}-${GCC}-${SRCDATE}.zip"

SRC_URI[md5sum] = "d66de07c018e8ed23d20187cf105881c"
SRC_URI[sha256sum] = "21ebdad1d6bc7883158a37f0827d3d41a8453b504220c5c7786a3185491888d1"

COMPATIBLE_MACHINE = "et7x00"
