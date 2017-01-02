KV = "4.4.8"
SRCDATE = "20161128"
GCC = "4.9.1"

require et-dvb-modules.inc

SRC_URI = "http://www.et-view.com/img_up/shop_pds/bh190/Img_Xtrend/${MACHINE}-drivers-${KV}-${GCC}-${SRCDATE}.zip"

SRC_URI[md5sum] = "d469857e460ceffb281e63ed9798739d"
SRC_URI[sha256sum] = "fe6bbc4121bf1248e1a2e0b351930f9593ec4b730c3b52618549a7a5b2bcfb34"

COMPATIBLE_MACHINE = "et8500"
