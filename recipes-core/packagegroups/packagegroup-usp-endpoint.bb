# Packagegroups usp endpoint

SUMMARY = "USP endpoint allows communication betwween the host and the LCM container"
PR = "r1"

inherit packagegroup

RDEPENDS:${PN} ="\
    usp-endpoint \
    mod-amxb-usp \
    controller-container \
"