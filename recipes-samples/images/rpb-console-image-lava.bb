require rpb-console-image.bb

IMAGE_ROOTFS_EXTRA_SPACE = "32768"

CORE_IMAGE_BASE_INSTALL += " \
    packagegroup-rpb-tests \
    "
