

SRC_URI = "git://gitlab.com/soft.at.home/usp/applications/uspagent.git;protocol=https;nobranch=1"
SRCREV = "v3.2.0"
S = "${WORKDIR}/git"
inherit pkgconfig config-amx

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

RDEPENDS_${PN} += "libamxc"
RDEPENDS_${PN} += "libamxp"
RDEPENDS_${PN} += "libamxj"
RDEPENDS_${PN} += "libamxd"
RDEPENDS_${PN} += "libamxb"
RDEPENDS_${PN} += "libamxa"
RDEPENDS_${PN} += "libamxo"
RDEPENDS_${PN} += "libsahtrace"
RDEPENDS_${PN} += "libimtp"
RDEPENDS_${PN} += "libusp"
RDEPENDS_${PN} += "libuspi"
RDEPENDS_${PN} += "mod-dmext"
RDEPENDS_${PN} += "mod-amxb-usp"


FILES_${PN} += "/usr/lib/amx/${COMPONENT}/${COMPONENT}.so"
FILES_${PN} += "/etc/amx/${COMPONENT}/${COMPONENT}.odl"
FILES_${PN} += "/etc/amx/modules/discovery_definition.odl"
FILES_${PN} += "${BINDIR}/${COMPONENT}"
FILES_${PN} += "${INITDIR}/${COMPONENT}"
FILES_${PN} += "${LIBDIR}/debuginfo/D99${COMPONENT}"
