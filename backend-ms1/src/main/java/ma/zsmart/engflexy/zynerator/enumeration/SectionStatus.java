package ma.zsmart.engflexy.zynerator.enumeration;

public enum SectionStatus {
        VALID("VALID"),
        CONTENU_MESSING("CONTENU_MESSING"),
        MEDIA_MESSING("MEDIA_MESSING");

        private final String value;

        SectionStatus(String value) {
                this.value = value;
        }

        public String getValue() {
                return value;
        }
}
