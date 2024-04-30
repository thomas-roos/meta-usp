

SRC_URI = "git://gitlab.com/prpl-foundation/components/core/libraries/libusp.git;protocol=https;nobranch=1"
SRCREV = "v2.6.8"

S = "${WORKDIR}/git"

inherit pkgconfig config-usp

SUMMARY = "converts protobuf messages to amx variants"
LICENSE += "SAH & BSD-2-Clause-Patent & OBUSPA"
LIC_FILES_CHKSUM += "file://LICENSE.BSD2;md5=cd9db409406fd4c7234d852479547016"
LIC_FILES_CHKSUM += "file://LICENSE.BSD3;md5=f16dcbad8d963a623b8baf43f2c0f003"

COMPONENT = "libusp"



export CONFIG_SAH_LIB_USP

CONFIG_SAH_LIB_USP ??= "y"

SAH_CONFIG += " \
                CONFIG_SAH_LIB_USP \
                "

DEPENDS += "libamxc"
DEPENDS += "libamxj"
DEPENDS += "libamxd"
DEPENDS += "libsahtrace"
DEPENDS += "libuspprotobuf"

RDEPENDS:${PN} += "libamxc"
RDEPENDS:${PN} += "libamxj"
RDEPENDS:${PN} += "libamxd"
RDEPENDS:${PN} += "libsahtrace"
RDEPENDS:${PN} += "libuspprotobuf"

EXTRA_OEMAKE += "DEST=${D} \
                 PREFIX=${prefix} \
                 LIBDIR=${libdir} \
                 BINDIR=${bindir} \
                 INCLUDEDIR=${includedir} \
                 "

FILES:${PN}-dev += "${INCLUDEDIR}/usp/*.h"
FILES:${PN} += "${LIBDIR}/${COMPONENT}${SOLIBS}"
FILES:${PN}-dev += "${LIBDIR}/${COMPONENT}${SOLIBSDEV}"
