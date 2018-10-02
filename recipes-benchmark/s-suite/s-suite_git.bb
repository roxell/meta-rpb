SUMMARY = "Small collection of benchmarks for storage I/O"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b529aaa6a0c50f15d29f89609b5c22f3"

SRCREV = "cf24d76722a5e55f502d75ac9a8eaffc73afdb58"
SRC_URI = "git://github.com/Algodev-github/S.git;protocol=https;branch=master"

S = "${WORKDIR}/git"

DEPENDS = "rsync"
RDEPENDS_${PN} = "libaio-dev bash gcc fio gawk g++ libaio sysstat bc coreutils"

do_install() {
    mkdir -p ${D}/opt/
    cp -Rd --preserve=mode,timestamps ${S} ${D}/opt/S-suite
    rm -rf ${D}/opt/S-suite/.git
}

FILES_${PN} = "/opt/S-suite/"

INSANE_SKIP_${PN} += "dev-deps"
