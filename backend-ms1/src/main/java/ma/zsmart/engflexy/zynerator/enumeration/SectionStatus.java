package ma.zsmart.engflexy.zynerator.enumeration;

public enum SectionStatus {
    VALIDATE("VALIDATE"),
    CONTENU_MESSING("CONTENU_MESSING"),
    MEDIA_MESSING("MEDIA_MESSING"),
    PENDING("PENDING");

    private final String value;

    SectionStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String tostring() {
        if (value == null) return "";
        return value.toUpperCase().replace('_', ' ');
    }

    public static SectionStatus toEnum(String status) {
        if (status == null) return null;
        status = status.toUpperCase().replace(' ', '_');
        return SectionStatus.valueOf(status);
    }
}
