

SRC_URI = "git://gitlab.com/soft.at.home/usp/libraries/libusp.git;protocol=https;nobranch=1"
SRCREV = ""

S = "${WORKDIR}/git"

inherit pkgconfig config-amx

SUMMARY = "libusp can be used for converting USP protobuf messages to ambiorix variants and vice versa."
LICENSE += "SAH & BBF & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=f327b882d63b048b71ed6d120cd0c19a"
LIC_FILES_CHKSUM += "file://LICENSE;md5=a705237d3056b8a8c89eb03485d722ce"

COMPONENT = "libusp"



export CONFIG_SAH_LIB_USP

CONFIG_SAH_LIB_USP ??= "y"

SAH_CONFIG += " \
                CONFIG_SAH_LIB_USP \
                "

DEPENDS += "libamxc"
DEPENDS += "libamxj"
DEPENDS += "libamxd"
DEPENDS += "libsahtrace"
DEPENDS += "libuspprotobuf"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxj"
RDEPENDS:${PN} += "libamxd"
RDEPENDS:${PN} += "libsahtrace"
RDEPENDS:${PN} += "libuspprotobuf"

EXTRA_OEMAKE += "DEST=${D} \
                 PREFIX=${prefix} \
                 LIBDIR=${libdir} \
                 BINDIR=${bindir} \
                 INCLUDEDIR=${includedir} \
                 "

do_install() {
        oe_runmake install
}

FILES:${PN}-dev += "${INCLUDEDIR}/usp/*.h"
FILES:${PN} += "${LIBDIR}/${COMPONENT}${SOLIBS}"
FILES:${PN}-dev += "${LIBDIR}/${COMPONENT}${SOLIBSDEV}"
