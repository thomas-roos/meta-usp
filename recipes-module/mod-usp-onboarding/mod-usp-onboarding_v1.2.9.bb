

SRC_URI = ".git;protocol=https;nobranch=1"
SRCREV = "v1.2.9"

S = "${WORKDIR}/git"

inherit pkgconfig config-usp

SUMMARY = "This module handles the typical onboarding procedure of a USP Controller after a first boot"
LICENSE += "BSD-2-Clause-Patent & SAH"
LIC_FILES_CHKSUM += "file://LICENSE;md5=6985054d3f2d7dbde00e278406c8cda2"

COMPONENT = "mod-usp-onboarding"



export CONFIG_SAH_MOD_USP_ONBOARDING

CONFIG_SAH_MOD_USP_ONBOARDING ??= "y"

SAH_CONFIG += " \
                CONFIG_SAH_MOD_USP_ONBOARDING \
                "

DEPENDS += "libamxc"
DEPENDS += "libamxp"
DEPENDS += "libamxd"
DEPENDS += "libamxb"
DEPENDS += "libamxo"
DEPENDS += "libsahtrace"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxp"
RDEPENDS:${PN} += "libamxd"
RDEPENDS:${PN} += "libamxb"
RDEPENDS:${PN} += "libamxo"
RDEPENDS:${PN} += "libsahtrace"

inherit update-rc.d
INITSCRIPT_NAME = "onboarding_boot_event"

INITSCRIPT_PARAMS = "start 99 2 3 4 5 . stop 99 0 1 6 ."

EXTRA_OEMAKE += "DEST=${D} \
                 PREFIX=${prefix} \
                 LIBDIR=${libdir} \
                 BINDIR=${bindir} \
                 INCLUDEDIR=${includedir} \
                 "

FILES:${PN} += "/etc/amx/${COMPONENT}/${COMPONENT}.odl"
FILES:${PN} += "/etc/amx/${COMPONENT}/${COMPONENT}_definition.odl"
FILES:${PN} += "/etc/amx/${COMPONENT}/${COMPONENT}_extra.odl"
FILES:${PN} += "/usr/lib/amx/modules/${COMPONENT}.so"
FILES:${PN} += "${BINDIR}/send_boot_event.lua"
FILES:${PN} += "${INITDIR}/onboarding_boot_event"
