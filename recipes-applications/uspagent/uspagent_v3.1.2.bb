

SRC_URI = "git://gitlab.com/soft.at.home/usp/applications/uspagent.git;protocol=https;nobranch=1"
SRCREV = "v3.1.2"

S = "${WORKDIR}/git"

inherit pkgconfig config-usp

SUMMARY = "USP agent as specified by TR-369"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=a705237d3056b8a8c89eb03485d722ce"

COMPONENT = "uspagent"


DEPENDS += "libamxc"
DEPENDS += "libamxp"
DEPENDS += "libamxj"
DEPENDS += "libamxd"
DEPENDS += "libamxb"
DEPENDS += "libamxa"
DEPENDS += "libamxo"
DEPENDS += "libsahtrace"
DEPENDS += "libimtp"
DEPENDS += "libusp"
DEPENDS += "libuspi"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxp"
RDEPENDS:${PN} += "libamxj"
RDEPENDS:${PN} += "libamxd"
RDEPENDS:${PN} += "libamxb"
RDEPENDS:${PN} += "libamxa"
RDEPENDS:${PN} += "libamxo"
RDEPENDS:${PN} += "libsahtrace"
RDEPENDS:${PN} += "libimtp"
RDEPENDS:${PN} += "libusp"
RDEPENDS:${PN} += "libuspi"
RDEPENDS:${PN} += "mod-dmext"
RDEPENDS:${PN} += "mod-amxb-usp"


EXTRA_OEMAKE += "DEST=${D} \
                 PREFIX=${prefix} \
                 LIBDIR=${libdir} \
                 BINDIR=${bindir} \
                 INCLUDEDIR=${includedir} \
                 "

do_install() {
        oe_runmake install
}

FILES:${PN} += "/usr/lib/amx/${COMPONENT}/${COMPONENT}.so"
FILES:${PN} += "/etc/amx/${COMPONENT}/${COMPONENT}.odl"
FILES:${PN} += "/etc/amx/modules/discovery_definition.odl"
FILES:${PN} += "${BINDIR}/${COMPONENT}"
FILES:${PN} += "${INITDIR}/${COMPONENT}"
FILES:${PN} += "${LIBDIR}/debuginfo/D99${COMPONENT}"
