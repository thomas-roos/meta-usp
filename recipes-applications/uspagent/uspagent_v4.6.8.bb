

SRC_URI = "git://gitlab.com/soft.at.home/usp/applications/uspagent.git;protocol=https;nobranch=1"
SRCREV = "v4.6.8"

S = "${WORKDIR}/git"

inherit pkgconfig config-usp

SUMMARY = "USP agent as specified by TR-369"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=cd9db409406fd4c7234d852479547016"

COMPONENT = "uspagent"



export CONFIG_SAH_SERVICES_USPAGENT

CONFIG_SAH_SERVICES_USPAGENT ??= "y"

SAH_CONFIG += " \
                CONFIG_SAH_SERVICES_USPAGENT \
                "

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

inherit update-rc.d
INITSCRIPT_NAME = "${COMPONENT}"

INITSCRIPT_PARAMS = "start 99 2 3 4 5 . stop 99 0 1 6 ."

EXTRA_OEMAKE += "DEST=${D} \
                 PREFIX=${prefix} \
                 LIBDIR=${libdir} \
                 BINDIR=${bindir} \
                 INCLUDEDIR=${includedir} \
                 "

FILES:${PN} += "/usr/lib/amx/${COMPONENT}/${COMPONENT}.so"
FILES:${PN} += "/etc/amx/${COMPONENT}/${COMPONENT}.odl"
FILES:${PN} += "/etc/amx/modules/discovery_definition.odl"
FILES:${PN} += "/etc/amx/${COMPONENT}/${COMPONENT}_extra.odl"
FILES:${PN} += "${BINDIR}/${COMPONENT}"
FILES:${PN} += "${PROCMONDIR}/${COMPONENT}"
FILES:${PN} += "${INITDIR}/${COMPONENT}"
FILES:${PN} += "${LIBDIR}/debuginfo/D99${COMPONENT}"
