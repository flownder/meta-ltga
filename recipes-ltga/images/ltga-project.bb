SUMMARY = "LTGA Image"
DESCRIPTION = "This image contain software for LTGA project"
 
LICENSE = "MIT"
 
inherit core-image
IMAGE_LINGUAS = "en-us"

IMAGE_ROOTFS_SIZE = "65536"
IMAGE_FSTYPES += " cpio.gz "

IMAGE_INSTALL = "packagegroup-core-boot ${ROOTFS_PKGMANAGE_BOOTSTRAP} ${CORE_IMAGE_EXTRA_INSTALL}"
IMAGE_INSTALL += " dropbear"