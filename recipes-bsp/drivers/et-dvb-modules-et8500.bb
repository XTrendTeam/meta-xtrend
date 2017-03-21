KV = "4.4.8"
SRCDATE = "20170318"
GCC = "6.2.0"

require et-dvb-modules.inc

SRC_URI = "http://www.et-view.com/img_up/shop_pds/bh190/Img_Xtrend/${MACHINE}-drivers-${KV}-${GCC}-${SRCDATE}.zip"

SRC_URI[md5sum] = "2d0f1245ddeb4561f28ac2c7f68768f6"
SRC_URI[sha256sum] = "f7b28b44b602f8ff5ce5650d80961e61c84f6cf602aaaf479f859bbafee8d6a2"

COMPATIBLE_MACHINE = "et8500"
