SUMMARY = "Linux Kernel bpftool (linux-bpftool next)"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"
PV = "4.14+git${SRCPV}"
SRCREV = "${AUTOREV}"

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/next/linux-next.git;protocol=https;branch=master;name=kernel"

S = "${WORKDIR}/git"

export INSTALL_PATH = "/opt/kselftests/next"

require bpftool-common.inc
