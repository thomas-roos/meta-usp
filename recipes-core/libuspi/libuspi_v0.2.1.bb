

SRC_URI = "git://gitlab.com/soft.at.home/usp/libraries/libuspi.git;protocol=https;nobranch=1"
SRCREV = "v2.0.1"

S = "${WORKDIR}/git"

inherit pkgconfig config-usp

SUMMARY = "libuspi is a common library for setting up and managing IMTP connections"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=a705237d3056b8a8c89eb03485d722ce"

COMPONENT = "libuspi"



export CONFIG_SAH_LIB_USPI

CONFIG_SAH_LIB_USPI ??= "y"

SAH_CONFIG += " \
                CONFIG_SAH_LIB_USPI \
                "

DEPENDS += "libamxc"
DEPENDS += "libamxp"
DEPENDS += "libamxd"
DEPENDS += "libamxb"
DEPENDS += "libsahtrace"
DEPENDS += "libusp"
DEPENDS += "libimtp"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxp"
RDEPENDS:${PN} += "libamxd"
RDEPENDS:${PN} += "libamxb"
RDEPENDS:${PN} += "libsahtrace"
RDEPENDS:${PN} += "libusp"
RDEPENDS:${PN} += "libimtp"

EXTRA_OEMAKE += "DEST=${D} \
                 PREFIX=${prefix} \
                 LIBDIR=${libdir} \
                 BINDIR=${bindir} \
                 INCLUDEDIR=${includedir} \
                 "

do_install() {
        oe_runmake install
}

FILES:${PN}-dev += "${INCLUDEDIR}/uspi/*.h"
FILES:${PN} += "${LIBDIR}/${COMPONENT}${SOLIBS}"
FILES:${PN}-dev += "${LIBDIR}/${COMPONENT}${SOLIBSDEV}"
