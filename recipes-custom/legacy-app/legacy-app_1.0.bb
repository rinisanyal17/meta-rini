SUMMARY = "Legacy-style recipe for migration practice"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://app.sh"
S = "${WORKDIR}"

# OLD STYLE - these will cause warnings/errors in Scarthgap:
RDEPENDS_${PN} = "bash"
FILES_${PN} = "${bindir}/app.sh"

do_install_append() {
    install -d ${D}${bindir}
    install -m 0755 ${WORKDIR}/app.sh ${D}${bindir}/app
}
