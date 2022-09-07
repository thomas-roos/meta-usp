

SRC_URI = "git://gitlab.com/soft.at.home/usp/libraries/libusp.git;protocol=https;nobranch=1"
SRCREV = "v0.8.2"
S = "${WORKDIR}/git"
inherit pkgconfig config-amx

SUMMARY = "libusp can be used for converting USP protobuf messages to ambiorix variants and vice versa."
LICENSE += "SAH & BBF & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=f327b882d63b048b71ed6d120cd0c19a"
LIC_FILES_CHKSUM += "file://LICENSE;md5=a705237d3056b8a8c89eb03485d722ce"

COMPONENT = "libusp"


DEPENDS += "libamxc"
DEPENDS += "libamxj"
DEPENDS += "libamxd"
DEPENDS += "libsahtrace"
DEPENDS += "libuspprotobuf"

RDEPENDS_${PN} += "libamxc"
RDEPENDS_${PN} += "libamxj"
RDEPENDS_${PN} += "libamxd"
RDEPENDS_${PN} += "libsahtrace"
RDEPENDS_${PN} += "libuspprotobuf"

FILES_${PN}-dev += "${INCLUDEDIR}/usp/*.h"
FILES_${PN} += "${LIBDIR}/${COMPONENT}${SOLIBS}"
FILES_${PN}-dev += "${LIBDIR}/${COMPONENT}${SOLIBSDEV}"
