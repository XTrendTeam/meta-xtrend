KV = "3.14.10"
SRCDATE = "20140915"

require et-dvb-modules.inc

SRC_URI = "http://xtrendet.net/${MACHINE}-drivers-${KV}-${SRCDATE}.zip"

SRC_URI[md5sum] = "ef2f44b0a3a9f0087aba3ca5041bca45"
SRC_URI[sha256sum] = "7ef1342c043ce395a694b0472a12d10d9319dcf6343154be400e6c931c4a1d42"

COMPATIBLE_MACHINE = "et7x00"
