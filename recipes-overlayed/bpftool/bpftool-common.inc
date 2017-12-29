PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit kernel-arch

# kernel bpftool dependencies
DEPENDS = "binutils binutils-native elfutils readline bison flex"
BPFTOOL_ARGS = "-i -C ${S}/tools/bpf prefix=${D}${INSTALL_PATH} CC="${CC}" LD="${LD}" ARCH=${ARCH}"

CFLAGS += "-DPACKAGE -DPACKAGE_VERSION"
do_compile() {
    # Make sure to install the user space API used by some tests
    # but not properly declared as a build dependency
    ${MAKE} -C ${S} ARCH=${ARCH} headers_install
    ${MAKE} ${BPFTOOL_ARGS}
}

do_install() {
    ${MAKE} ${BPFTOOL_ARGS} install
}

FILES_${PN} = "${INSTALL_PATH}"
FILES_${PN}-dbg = "${INSTALL_PATH}/*/.debug"

INSANE_SKIP_${PN} = "already-stripped ldflags"
