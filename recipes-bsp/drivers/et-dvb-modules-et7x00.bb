KV = "4.4.8"
SRCDATE = "20170318"
GCC = "6.2.0"

require et-dvb-modules.inc

SRC_URI = "http://www.et-view.com/img_up/shop_pds/bh190/Img_Xtrend/${MACHINE}-drivers-${KV}-${GCC}-${SRCDATE}.zip"

SRC_URI[md5sum] = "3aabe7a1b81705d439e8cf78684bcebf"
SRC_URI[sha256sum] = "7c28cf5c3bb011b0df791b694848e2a08ef2081d3151c20b39a80d0ac9ec9f21"

COMPATIBLE_MACHINE = "et7x00"
