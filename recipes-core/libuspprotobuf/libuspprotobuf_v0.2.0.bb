

S = "${WORKDIR}/git"

SRC_URI = "git://gitlab.com/soft.at.home/usp/libraries/libprotobuf.git;protocol=https;nobranch=1"
SRCREV = "v0.2.0"
inherit pkgconfig config-usp

SUMMARY = "This library generates C code from .proto files provided by bbf"
LICENSE += "SAH & BBF"
LIC_FILES_CHKSUM += "file://LICENSE;md5=f327b882d63b048b71ed6d120cd0c19a"

COMPONENT = "libuspprotobuf"


DEPENDS += "protobuf-c"
DEPENDS += "protobuf-native"
DEPENDS += "protobuf-c-native"

RDEPENDS_${PN} += "protobuf-c"

FILES_${PN}-dev += "/usr/include/uspprotobuf/*.h"
FILES_${PN} += "${LIBDIR}/${COMPONENT}${SOLIBS}"
FILES_${PN}-dev += "${LIBDIR}/${COMPONENT}${SOLIBSDEV}"
