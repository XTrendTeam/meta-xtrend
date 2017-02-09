KV = "4.4.8"
SRCDATE = "20170208"
GCC = "4.9.1"

require et-dvb-modules.inc

SRC_URI = "http://www.et-view.com/img_up/shop_pds/bh190/Img_Xtrend/${MACHINE}-drivers-${KV}-${GCC}-${SRCDATE}.zip"

SRC_URI[md5sum] = "18b65ab17bbdf3504a01b165b74609ac"
SRC_URI[sha256sum] = "1d60baf9c282a1bc7eac83c1691f9d58457a775c24b63bb589bfa13f85e5ed31"

COMPATIBLE_MACHINE = "et8500"
