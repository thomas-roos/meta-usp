

SRC_URI = "git://gitlab.com/soft.at.home/usp/libraries/libimtp.git;protocol=https;nobranch=1"

S = "${WORKDIR}/git"

inherit pkgconfig config-amx

SUMMARY = "libimtp is a library which provides functionality to set up a connection between two internal USP endpoints using a unix domain socket."
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=a705237d3056b8a8c89eb03485d722ce"

COMPONENT = "libimtp"



export CONFIG_SAH_LIB_IMTP

CONFIG_SAH_LIB_IMTP ??= "y"

SAH_CONFIG += " \
                CONFIG_SAH_LIB_IMTP \
                "

DEPENDS += "libamxc"
DEPENDS += "libsahtrace"
DEPENDS += "uriparser"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libsahtrace"
RDEPENDS:${PN} += "uriparser"

EXTRA_OEMAKE += "DEST=${D} \
                 PREFIX=${prefix} \
                 LIBDIR=${libdir} \
                 BINDIR=${bindir} \
                 INCLUDEDIR=${includedir} \
                 "

do_install() {
        oe_runmake install
}

FILES:${PN}-dev += "${INCLUDEDIR}/imtp/*.h"
FILES:${PN} += "${LIBDIR}/${COMPONENT}${SOLIBS}"
FILES:${PN}-dev += "${LIBDIR}/${COMPONENT}${SOLIBSDEV}"
