KV = "4.4.8"
SRCDATE = "20170227"
GCC = "4.9.1"

require et-dvb-modules.inc

SRC_URI = "http://www.et-view.com/img_up/shop_pds/bh190/Img_Xtrend/${MACHINE}-drivers-${KV}-${GCC}-${SRCDATE}.zip"

SRC_URI[md5sum] = "d15178c25a006bd340493484b1e52bab"
SRC_URI[sha256sum] = "282d5665262b55c492b50f8c33c579e948338d38169aedfc14f32d2d200a86d1"

COMPATIBLE_MACHINE = "et7x00"
