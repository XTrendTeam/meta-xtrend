KV = "4.4.8"
SRCDATE = "20170424"
GCC = "6.2.0"

require et-dvb-modules.inc

SRC_URI = "http://www.et-view.com/img_up/shop_pds/bh190/Img_Xtrend/${MACHINE}-drivers-${KV}-${GCC}-${SRCDATE}.zip"

SRC_URI[md5sum] = "ab33a2a9cc74303450eae6555d454dc5"
SRC_URI[sha256sum] = "e3b6cd4efd462219dab64c4145b8e8f02445aba1cf3b1028d1c08e92592c967a"

COMPATIBLE_MACHINE = "et7x00"
