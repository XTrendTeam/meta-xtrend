KV = "4.4.8"
SRCDATE = "20160601"
GCC = "4.9.1"

require et-dvb-modules.inc

SRC_URI = "http://xtrendet.net/${MACHINE}-drivers-${KV}-${GCC}-${SRCDATE}.zip"

SRC_URI[md5sum] = "69308060911d53174c82e335429a6fd6"
SRC_URI[sha256sum] = "d418a0b69b5c4cc9c2e33f9633331ff81b3cc63861c90fd7573a7612ce9847ee"

COMPATIBLE_MACHINE = "et8500"
