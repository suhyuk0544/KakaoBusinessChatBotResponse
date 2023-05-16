package org.suhyuk.Response;

public enum SkillVersion {

    VERSION2("2.0"),
    VERSION1("1.0");

    private final String version;

    SkillVersion(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }
}
