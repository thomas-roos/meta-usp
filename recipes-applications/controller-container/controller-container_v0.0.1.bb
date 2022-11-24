
FILESEXTRAPATHS:prepend := "${THISDIR}/files:"
SRC_URI += "file://controller-container.init"
SRC_URI += "file://controller-container.conf"
SRC_URI += "file://LICENSE.SAH"
SRC_URI += "file://LICENSE.BSD"

S = "${WORKDIR}"


SUMMARY = "CLI module to invoke USP RPCs using an available MTP"
LICENSE += "SAH & BSD-2-Clause-Patent"
LIC_FILES_CHKSUM = " \
                    file://LICENSE.SAH;md5=a0f6bf5b78959aa070b853b0ad21d9a2 \
                    file://LICENSE.BSD;md5=6bb6609ec7c25caf8b7b0eb6ed4480cf \
                    "
COMPONENT = "controller-container"

DEPENDS += "amx-cli"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxt"
RDEPENDS:${PN} += "libamxm"
RDEPENDS:${PN} += "libamxp"
RDEPENDS:${PN} += "libamxd"
RDEPENDS:${PN} += "libamxb"
RDEPENDS:${PN} += "amx-cli"
RDEPENDS:${PN} += "mod-ba-cli"
RDEPENDS:${PN} += "mod-dm-cli"
RDEPENDS:${PN} += "usp-endpoint"

do_install() {
        install -d ${D}/etc/amx/cli/
        install -D -m 0644 ${WORKDIR}/controller-container.init ${D}/etc/amx/cli/controller-container.init
        install -D -m 0644 ${WORKDIR}/controller-container.conf ${D}/etc/amx/cli/controller-container.conf
        install -d ${D}/usr/bin
        ln -sfr ${D}/usr/bin/amx-cli ${D}/usr/bin/controller-container
}

FILES:${PN} += "/etc/amx/cli/controller-container.init"
FILES:${PN} += "/etc/amx/cli/controller-container.conf"
FILES:${PN} += "${BINDIR}/controller-container"
