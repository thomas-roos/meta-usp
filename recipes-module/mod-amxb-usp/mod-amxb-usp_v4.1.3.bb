

SRC_URI = "git://gitlab.com/prpl-foundation/components/ambiorix/modules/amxb_backends/amxb_usp.git;protocol=https;nobranch=1"
SRCREV = "v4.1.3"

S = "${WORKDIR}/git"

inherit pkgconfig config-usp

SUMMARY = "USP backend implementation for amxb"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=6985054d3f2d7dbde00e278406c8cda2"

COMPONENT = "mod-amxb-usp"



export CONFIG_SAH_MOD_AMXB_USP
export CONFIG_SAH_MOD_AMXB_USP_INSTALL_DIR

CONFIG_SAH_MOD_AMXB_USP ??= "y"
CONFIG_SAH_MOD_AMXB_USP_INSTALL_DIR ??= "/usr/bin/mods/usp"

SAH_CONFIG += " \
                CONFIG_SAH_MOD_AMXB_USP \
                CONFIG_SAH_MOD_AMXB_USP_INSTALL_DIR \
                "

DEPENDS += "libamxc"
DEPENDS += "libamxp"
DEPENDS += "libamxd"
DEPENDS += "libamxb"
DEPENDS += "libimtp"
DEPENDS += "libusp"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxp"
RDEPENDS:${PN} += "libamxd"
RDEPENDS:${PN} += "libamxb"
RDEPENDS:${PN} += "libimtp"
RDEPENDS:${PN} += "libusp"

EXTRA_OEMAKE += "DEST=${D} \
                 PREFIX=${prefix} \
                 LIBDIR=${libdir} \
                 BINDIR=${bindir} \
                 INCLUDEDIR=${includedir} \
                 "

FILES:${PN} += "${CONFIG_SAH_MOD_AMXB_USP_INSTALL_DIR}/${COMPONENT}.so"
