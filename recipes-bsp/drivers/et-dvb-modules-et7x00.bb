KV = "3.14.10"
SRCDATE = "20140926"

require et-dvb-modules.inc

SRC_URI = "http://xtrendet.net/${MACHINE}-drivers-${KV}-${SRCDATE}.zip"

SRC_URI[md5sum] = "9b42ab51477b724e28de303cb5e4f63e"
SRC_URI[sha256sum] = "22eb98c49fa69affbd4b43dd98d1a7405d62e8474ca71eef634ce6765d13f777"

COMPATIBLE_MACHINE = "et7x00"
