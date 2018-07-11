SUMMARY = "Small collection of benchmarks for storage I/O - Version 2.3"
HOMEPAGE = "https://github.com/Algodev-github/S"
SECTION = "console/utils"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b529aaa6a0c50f15d29f89609b5c22f3"

SRC_URI = "git://github.com/Algodev-github/S.git"

SRCREV = "065d3912d56f7b30bfe0df59eef9267e11e4ff77"
PV = "0.1+git${SRCREV}"

S = "${WORKDIR}/git"

do_install(){
    install -d ${D}/opt/ssuite/
    cp -r ${S}/* ${D}/opt/ssuite/
}

FILES_${PN} = "/opt/ssuite/*"

RDEPENDS_${PN} = "\
    bash bc coreutils fio \
    gawk g++ libaio sysstat \
"
