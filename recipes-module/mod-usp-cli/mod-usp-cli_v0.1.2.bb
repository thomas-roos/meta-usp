

SRC_URI = ".git;protocol=https;nobranch=1"
SRCREV = ""

S = "${WORKDIR}/git"

inherit pkgconfig config-usp

SUMMARY = "CLI module to invoke USP RPCs using an available MTP"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=a705237d3056b8a8c89eb03485d722ce"

COMPONENT = "mod-usp-cli"



export CONFIG_SAH_MOD_USP_CLI

CONFIG_SAH_MOD_USP_CLI ??= "y"

SAH_CONFIG += " \
                CONFIG_SAH_MOD_USP_CLI \
                "

DEPENDS += "libamxc"
DEPENDS += "libamxt"
DEPENDS += "libamxm"
DEPENDS += "libamxp"
DEPENDS += "libamxd"
DEPENDS += "libamxb"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxt"
RDEPENDS:${PN} += "libamxm"
RDEPENDS:${PN} += "libamxp"
RDEPENDS:${PN} += "libamxd"
RDEPENDS:${PN} += "libamxb"
RDEPENDS:${PN} += "amx-cli"
RDEPENDS:${PN} += "mod-ba-cli"
RDEPENDS:${PN} += "mod-dm-cli"
RDEPENDS:${PN} += "tr181-mqtt"
RDEPENDS:${PN} += "usp-endpoint"

EXTRA_OEMAKE += "DEST=${D} \
                 PREFIX=${prefix} \
                 LIBDIR=${libdir} \
                 BINDIR=${bindir} \
                 INCLUDEDIR=${includedir} \
                 "

do_install() {
        oe_runmake install
}

FILES:${PN} += "/usr/lib/amx/amx-cli/${COMPONENT}.so"
FILES:${PN} += "/etc/amx/cli/usp-cli.init"
FILES:${PN} += "/etc/amx/cli/usp-cli.conf"
FILES:${PN} += "${BINDIR}/usp-cli"
