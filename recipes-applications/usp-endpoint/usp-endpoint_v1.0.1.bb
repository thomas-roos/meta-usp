


S = "${WORKDIR}/git"

inherit pkgconfig config-amx

SUMMARY = "Mini USP agent or controller"
LICENSE += "SAH"

COMPONENT = "usp-endpoint"



export CONFIG_SAH_SERVICES_USP-ENDPOINT

CONFIG_SAH_SERVICES_USP-ENDPOINT ??= "y"

SAH_CONFIG += " \
                CONFIG_SAH_SERVICES_USP-ENDPOINT \
                "

DEPENDS += "libamxc"
DEPENDS += "libamxd"
DEPENDS += "libamxm"
DEPENDS += "libamxp"
DEPENDS += "libamxb"
DEPENDS += "libamxo"
DEPENDS += "libimtp"
DEPENDS += "libusp"
DEPENDS += "libuspi"
DEPENDS += "libsahtrace"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxd"
RDEPENDS:${PN} += "libamxm"
RDEPENDS:${PN} += "libamxp"
RDEPENDS:${PN} += "libamxb"
RDEPENDS:${PN} += "libamxo"
RDEPENDS:${PN} += "libimtp"
RDEPENDS:${PN} += "libusp"
RDEPENDS:${PN} += "libuspi"
RDEPENDS:${PN} += "libsahtrace"

EXTRA_OEMAKE += "DEST=${D} \
                 PREFIX=${prefix} \
                 LIBDIR=${libdir} \
                 BINDIR=${bindir} \
                 INCLUDEDIR=${includedir} \
                 "

do_install() {
        oe_runmake install
}

FILES:${PN} += "/etc/amx/uspc/uspc.odl"
FILES:${PN} += "/etc/amx/uspc/defaults/odl/01-uspc_defaults.odl"
FILES:${PN} += "/etc/amx/uspc/uspc_definition.odl"
FILES:${PN} += "/etc/amx/uspa/uspa.odl"
FILES:${PN} += "/etc/amx/uspa/defaults/odl/01-uspa_defaults.odl"
FILES:${PN} += "/etc/amx/uspa/uspa_definition.odl"
FILES:${PN} += "/etc/amx/uspc/mtp_mqtt.odl"
FILES:${PN} += "/etc/amx/uspa/mtp_mqtt.odl"
FILES:${PN} += "/etc/amx/tr181-mqtt/defaults/odl/01-mqtt-client-uspa.odl"
FILES:${PN} += "/etc/amx/tr181-mqtt/defaults/odl/01-mqtt-client-uspc.odl"
FILES:${PN} += "/etc/amx/uspc/mtp_imtp.odl"
FILES:${PN} += "/etc/amx/tr181-mqtt/defaults/uci/MQTT-01-uspa"
FILES:${PN} += "/etc/amx/tr181-mqtt/defaults/uci/MQTT-01-uspc"
FILES:${PN} += "${BINDIR}/uspc"
FILES:${PN} += "${BINDIR}/uspa"
FILES:${PN} += "/usr/lib/amx/modules/${COMPONENT}.so"
