KV = "4.4.8"
SRCDATE = "20170208"
GCC = "4.9.1"

require et-dvb-modules.inc

SRC_URI = "http://www.et-view.com/img_up/shop_pds/bh190/Img_Xtrend/${MACHINE}-drivers-${KV}-${GCC}-${SRCDATE}.zip"

SRC_URI[md5sum] = "740be5595699c07dd0f20bbfce0138eb"
SRC_URI[sha256sum] = "9efb2ac35d13bc4f548e0d29b2ae96c09c58dbc7bbb04afabc14f2fd86324510"

COMPATIBLE_MACHINE = "et7x00"
