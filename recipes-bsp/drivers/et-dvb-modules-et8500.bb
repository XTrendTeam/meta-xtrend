KV = "4.4.8"
SRCDATE = "20170424"
GCC = "6.2.0"

require et-dvb-modules.inc

SRC_URI = "http://www.et-view.com/img_up/shop_pds/bh190/Img_Xtrend/${MACHINE}-drivers-${KV}-${GCC}-${SRCDATE}.zip"

SRC_URI[md5sum] = "e7a6adbc95bc7aeb5788b762becc12e5"
SRC_URI[sha256sum] = "ea6e94b41090d970754ddeb56f3f1a3120b72fb53db873ced0f64b7ad06233d9"

COMPATIBLE_MACHINE = "et8500"
