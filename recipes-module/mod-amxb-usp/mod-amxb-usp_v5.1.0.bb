

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_usp.git;protocol=https;nobranch=1"
SRCREV = "v5.1.0"

S = "${WORKDIR}/git"

inherit pkgconfig config-usp

SUMMARY = "USP backend implementation for amxb"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=cd9db409406fd4c7234d852479547016"

COMPONENT = "mod-amxb-usp"



export CONFIG_SAH_MOD_AMXB_USP
export CONFIG_SAH_MOD_AMXB_USP_INSTALL_DIR
export CONFIG_SAH_MOD_AMXB_USP_REQUIRES_DEVICE_PREFIX

CONFIG_SAH_MOD_AMXB_USP ??= "y"
CONFIG_SAH_MOD_AMXB_USP_INSTALL_DIR ??= "/usr/bin/mods/usp"
CONFIG_SAH_MOD_AMXB_USP_REQUIRES_DEVICE_PREFIX ??= "n"

SAH_CONFIG += " \
                CONFIG_SAH_MOD_AMXB_USP \
                CONFIG_SAH_MOD_AMXB_USP_INSTALL_DIR \
                CONFIG_SAH_MOD_AMXB_USP_REQUIRES_DEVICE_PREFIX \
                "

DEPENDS += "libamxc"
DEPENDS += "libamxp"
DEPENDS += "libamxd"
DEPENDS += "libamxb"
DEPENDS += "libamxo"
DEPENDS += "libimtp"
DEPENDS += "libusp"
DEPENDS += "libuspi"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxp"
RDEPENDS:${PN} += "libamxd"
RDEPENDS:${PN} += "libamxb"
RDEPENDS:${PN} += "libamxo"
RDEPENDS:${PN} += "libimtp"
RDEPENDS:${PN} += "libusp"
RDEPENDS:${PN} += "libuspi"

EXTRA_OEMAKE += "DEST=${D} \
                 PREFIX=${prefix} \
                 LIBDIR=${libdir} \
                 BINDIR=${bindir} \
                 INCLUDEDIR=${includedir} \
                 "

FILES:${PN} += "${CONFIG_SAH_MOD_AMXB_USP_INSTALL_DIR}/${COMPONENT}.so"
FILES:${PN} += "/etc/amx/modules/usp/local-agent.odl"
