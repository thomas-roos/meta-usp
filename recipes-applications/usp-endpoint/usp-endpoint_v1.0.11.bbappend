FILESEXTRAPATHS:prepend := "${THISDIR}/files:"
SRC_URI += "file://01-uspe_defaults.odl"

do_install:append() {
   mkdir -p ${D}/etc/amx/uspe/defaults/odl/
   install -m 644  ${WORKDIR}/01-uspe_defaults.odl ${D}/etc/amx/uspe/defaults/odl/01-uspe_defaults.odl
}
