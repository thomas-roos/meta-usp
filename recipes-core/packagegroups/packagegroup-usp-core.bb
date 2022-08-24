DESCRIPTION = "package group for the core project"

LICENSE = "MIT"

SECTION = "packagegroup"

inherit packagegroup

PACKAGES = "${PN}"
PROVIDES = "${PACKAGES}"

DEPENDS = " \
    libimtp \ 
    libuspi \
    libuspprotobuf \
    libusp \
    "
