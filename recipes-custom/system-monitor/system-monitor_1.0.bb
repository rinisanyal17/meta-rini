SUMMARY = "Simple system monitor script"
DESCRIPTION = "Installs a shell script that logs CPU and memory usage"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://system-monitor.sh"

S = "${WORKDIR}"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${WORKDIR}/system-monitor.sh ${D}${bindir}/system-monitor
}

