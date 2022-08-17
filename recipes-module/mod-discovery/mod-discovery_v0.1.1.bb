

SRC_URI = ".git;protocol=https;nobranch=1"
SRCREV = ""

S = "${WORKDIR}/git"

inherit pkgconfig config-amx

SUMMARY = "Data model discovery module"
LICENSE += "BSD-2-Clause-Patent & SAH"
LIC_FILES_CHKSUM += "file://LICENSE;md5=a705237d3056b8a8c89eb03485d722ce"

COMPONENT = "mod-discovery"



export CONFIG_SAH_MOD_DISCOVERY

CONFIG_SAH_MOD_DISCOVERY ??= "y"

SAH_CONFIG += " \
                CONFIG_SAH_MOD_DISCOVERY \
                "

DEPENDS += "libamxc"
DEPENDS += "libamxp"
DEPENDS += "libamxd"
DEPENDS += "libamxb"
DEPENDS += "libamxo"
DEPENDS += "libimtp"
DEPENDS += "libusp"
DEPENDS += "libsahtrace"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxp"
RDEPENDS:${PN} += "libamxd"
RDEPENDS:${PN} += "libamxb"
RDEPENDS:${PN} += "libamxo"
RDEPENDS:${PN} += "libimtp"
RDEPENDS:${PN} += "libusp"
RDEPENDS:${PN} += "libsahtrace"
RDEPENDS:${PN} += "amxrt"

EXTRA_OEMAKE += "DEST=${D} \
                 PREFIX=${prefix} \
                 LIBDIR=${libdir} \
                 BINDIR=${bindir} \
                 INCLUDEDIR=${includedir} \
                 "

do_install() {
        oe_runmake install
}

FILES:${PN} += "/etc/amx/${COMPONENT}/${COMPONENT}.odl"
FILES:${PN} += "/etc/amx/${COMPONENT}/${COMPONENT}_definition.odl"
FILES:${PN} += "/usr/lib/amx/${COMPONENT}/${COMPONENT}.so"
FILES:${PN} += "${BINDIR}/mod-discovery"
