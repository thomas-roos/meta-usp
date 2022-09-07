

SRC_URI = "git://gitlab.com/soft.at.home/usp/libraries/libimtp.git;protocol=https;nobranch=1"
SRCREV = "v1.4.2"
S = "${WORKDIR}/git"
inherit pkgconfig config-amx

SUMMARY = "libimtp is a library which provides functionality to set up a connection between two internal USP endpoints using a unix domain socket."
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=a705237d3056b8a8c89eb03485d722ce"

COMPONENT = "libimtp"


DEPENDS += "libamxc"
DEPENDS += "libsahtrace"
DEPENDS += "uriparser"

RDEPENDS_${PN} += "libamxc"
RDEPENDS_${PN} += "libsahtrace"
RDEPENDS_${PN} += "uriparser"

FILES_${PN}-dev += "${INCLUDEDIR}/imtp/*.h"
FILES_${PN} += "${LIBDIR}/${COMPONENT}${SOLIBS}"
FILES_${PN}-dev += "${LIBDIR}/${COMPONENT}${SOLIBSDEV}"
