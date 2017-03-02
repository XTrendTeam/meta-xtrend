KV = "4.4.8"
SRCDATE = "20170224"
GCC = "4.9.1"

require et-dvb-modules.inc

SRC_URI = "http://www.et-view.com/img_up/shop_pds/bh190/Img_Xtrend/${MACHINE}-drivers-${KV}-${GCC}-${SRCDATE}.zip"

SRC_URI[md5sum] = "9d16b9ea9f549ba3ab10bd8ba8d6aaf3"
SRC_URI[sha256sum] = "ec6b1fe1f13b44eac36c967c08d7f3a0a8f91d9aa659fbd23dea62e3cdb3535a"

COMPATIBLE_MACHINE = "et8500"
