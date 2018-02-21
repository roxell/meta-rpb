SUMMARY = "Linux Kernel Selftests (mainline-rc)"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"
PV = "4.16+git${SRCPV}"
SRCREV = "${AUTOREV}"


SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/torvalds/linux.git;protocol=https;branch=master;name=kernel"
# Patches inappropriate or not yet merged by upstream
# Some patches may have been submitted to upstream
SRC_URI += "\
    file://0001-selftests-lib-allow-to-override-CC-in-the-top-level-Makefile.patch \
    file://0001-selftests-gpio-fix-build-error.patch \
    file://0001-selftests-gpio-use-pkg-config-to-determine-libmount-.patch \
    file://0001-selftests-net-use-LDLIBS-instead-of-LDFLAGS.patch \
    file://0002-selftests-seccomp-use-LDLIBS-instead-of-LDFLAGS.patch \
    file://0003-selftests-timers-use-LDLIBS-instead-of-LDFLAGS.patch \
"

SRC_URI[md5sum] = "bacdb9ffdcd922aa069a5e1520160e24"
SRC_URI[sha256sum] = "f81d59477e90a130857ce18dc02f4fbe5725854911db1e7ba770c7cd350f96a7"

S = "${WORKDIR}/git"

export INSTALL_PATH = "/opt/kselftests/mainline-rc"

require kselftests-common.inc
