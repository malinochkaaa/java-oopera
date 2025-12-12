package show;

public enum ShowType {
    CLASSIC_SHOW("обычный спектакль"),
    OPERA("опера"),
    BALLET("балет");

    private final String displayName;

    ShowType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
