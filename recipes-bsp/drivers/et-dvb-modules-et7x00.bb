KV = "4.4.8"
SRCDATE = "20161031"
GCC = "4.9.1"

require et-dvb-modules.inc

SRC_URI = "http://www.et-view.com/img_up/shop_pds/bh190/Img_Xtrend/${MACHINE}-drivers-${KV}-${GCC}-${SRCDATE}.zip"

SRC_URI[md5sum] = "e969c0cf86604633f0c2bbd3ec8c9e33"
SRC_URI[sha256sum] = "08c98e00c8ce1e545057690890d3668d66b211633b2a717e5b928f54d8eec18d"

COMPATIBLE_MACHINE = "et7x00"
