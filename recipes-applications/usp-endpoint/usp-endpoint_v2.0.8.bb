

SRC_URI = "git://gitlab.com/soft.at.home/usp/applications/usp-endpoint.git;protocol=https;nobranch=1"
SRCREV = "v2.0.8"

S = "${WORKDIR}/git"

inherit pkgconfig config-usp

SUMMARY = "Mini USP agent or controller"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM += "file://LICENSE;md5=cd9db409406fd4c7234d852479547016"

COMPONENT = "usp-endpoint"



export CONFIG_SAH_SERVICES_USP-ENDPOINT
export CONFIG_SAH_SERVICES_USP-ENDPOINT_INSTALL_USPA
export CONFIG_SAH_SERVICES_USP-ENDPOINT_INSTALL_USPC
export CONFIG_SAH_SERVICES_USP-ENDPOINT_INSTALL_USPE

CONFIG_SAH_SERVICES_USP-ENDPOINT ??= "y"
CONFIG_SAH_SERVICES_USP-ENDPOINT_INSTALL_USPA ??= "n"
CONFIG_SAH_SERVICES_USP-ENDPOINT_INSTALL_USPC ??= "n"
CONFIG_SAH_SERVICES_USP-ENDPOINT_INSTALL_USPE ??= "n"

SAH_CONFIG += " \
                CONFIG_SAH_SERVICES_USP-ENDPOINT \
                CONFIG_SAH_SERVICES_USP-ENDPOINT_INSTALL_USPA \
                CONFIG_SAH_SERVICES_USP-ENDPOINT_INSTALL_USPC \
                CONFIG_SAH_SERVICES_USP-ENDPOINT_INSTALL_USPE \
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
RDEPENDS:${PN} += "mod-dmext"

inherit update-rc.d
INITSCRIPT_NAME = "uspa"

INITSCRIPT_PARAMS = "start 99 2 3 4 5 . stop 99 0 1 6 ."

inherit update-rc.d
INITSCRIPT_NAME = "uspc"

INITSCRIPT_PARAMS = "start 99 2 3 4 5 . stop 99 0 1 6 ."

inherit update-rc.d
INITSCRIPT_NAME = "uspe"

INITSCRIPT_PARAMS = "start 99 2 3 4 5 . stop 99 0 1 6 ."

EXTRA_OEMAKE += "DEST=${D} \
                 PREFIX=${prefix} \
                 LIBDIR=${libdir} \
                 BINDIR=${bindir} \
                 INCLUDEDIR=${includedir} \
                 "

FILES:${PN} += "/etc/amx/uspc/uspc.odl"
FILES:${PN} += "/etc/amx/uspc/defaults/odl/01-uspc_defaults.odl"
FILES:${PN} += "/etc/amx/uspc/uspc_definition.odl"
FILES:${PN} += "/etc/amx/uspa/uspa.odl"
FILES:${PN} += "/etc/amx/uspa/defaults/odl/01-uspa_defaults.odl"
FILES:${PN} += "/etc/amx/uspa/uspa_definition.odl"
FILES:${PN} += "/etc/amx/uspe/uspe.odl"
FILES:${PN} += "/etc/amx/uspe/defaults/odl/01-uspe_defaults.odl"
FILES:${PN} += "/etc/amx/uspe/uspe_definition.odl"
FILES:${PN} += "/etc/amx/usp/mtp_mqtt.odl"
FILES:${PN} += "/etc/amx/usp/mtp_uds.odl"
FILES:${PN} += "/etc/amx/tr181-mqtt/defaults/odl/01-mqtt-client-uspa.odl"
FILES:${PN} += "/etc/amx/tr181-mqtt/defaults/odl/01-mqtt-client-uspc.odl"
FILES:${PN} += "/etc/amx/tr181-mqtt/defaults/uci/MQTT-01-uspa"
FILES:${PN} += "/etc/amx/tr181-mqtt/defaults/uci/MQTT-01-uspc"
FILES:${PN} += "${BINDIR}/uspc"
FILES:${PN} += "${BINDIR}/uspa"
FILES:${PN} += "${BINDIR}/uspe"
FILES:${PN} += "/usr/lib/amx/modules/${COMPONENT}.so"
FILES:${PN} += "${INITDIR}/uspa"
FILES:${PN} += "${LIBDIR}/debuginfo/D99uspa"
FILES:${PN} += "${INITDIR}/uspc"
FILES:${PN} += "${LIBDIR}/debuginfo/D99uspc"
FILES:${PN} += "${INITDIR}/uspe"
FILES:${PN} += "${LIBDIR}/debuginfo/D99uspe"
