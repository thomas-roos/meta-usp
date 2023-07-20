

SRC_URI = "git://gitlab.com/soft.at.home/usp/libraries/libprotobuf.git;protocol=https;nobranch=1"
SRCREV = "v0.4.0"

S = "${WORKDIR}/git"

inherit pkgconfig config-usp

SUMMARY = "This library generates C code from .proto files provided by bbf"
LICENSE += "SAH & BBF"
LIC_FILES_CHKSUM += "file://LICENSE;md5=f327b882d63b048b71ed6d120cd0c19a"

COMPONENT = "libuspprotobuf"



export CONFIG_SAH_LIB_USP_PROTOBUF

CONFIG_SAH_LIB_USP_PROTOBUF ??= "y"

SAH_CONFIG += " \
                CONFIG_SAH_LIB_USP_PROTOBUF \
                "

DEPENDS += "protobuf-c"
DEPENDS += "protobuf-native"
DEPENDS += "protobuf-c-native"

RDEPENDS:${PN} += "protobuf-c"

EXTRA_OEMAKE += "DEST=${D} \
                 PREFIX=${prefix} \
                 LIBDIR=${libdir} \
                 BINDIR=${bindir} \
                 INCLUDEDIR=${includedir} \
                 "

FILES:${PN}-dev += "/usr/include/uspprotobuf/*.h"
FILES:${PN} += "${LIBDIR}/${COMPONENT}${SOLIBS}"
FILES:${PN}-dev += "${LIBDIR}/${COMPONENT}${SOLIBSDEV}"
