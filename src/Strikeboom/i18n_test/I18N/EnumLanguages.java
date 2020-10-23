package Strikeboom.i18n_test.I18N;

public enum EnumLanguages {
    ENGLISH("English","en_US"),
    BRIHISH("Brihish","en_UK");
    private final String name;
    private final String fileName;
    EnumLanguages(String name,String fileName) {
        this.name = name;
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public String getName() {
        return name;
    }
}
