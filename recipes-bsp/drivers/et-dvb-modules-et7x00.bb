KV = "4.4.8"
SRCDATE = "20160504"
GCC = "4.9.1"

require et-dvb-modules.inc

SRC_URI = "http://xtrendet.net/${MACHINE}-drivers-${KV}-${GCC}-${SRCDATE}.zip"

SRC_URI[md5sum] = "1c03497c0df47b24a215f7a320a9b6f6"
SRC_URI[sha256sum] = "7b4bbd61811024ef74cf6312cb11f6370d653fd5e363bcd6387ad3f4072b19c1"

COMPATIBLE_MACHINE = "et7x00"
