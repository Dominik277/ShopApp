package fishing.tackle.shop;

public class MainActivityModel {

    private int imageMainGore;
    private int imageMainDolje;
    private String titleMainGore;
    private String titleMainDolje;
    private String descMainGore;
    private String descMainDolje;

    public MainActivityModel(int imageMainGore, int imageMainDolje, String titleMainGore, String titleMainDolje, String descMainGore, String descMainDolje) {
        this.imageMainGore = imageMainGore;
        this.imageMainDolje = imageMainDolje;
        this.titleMainGore = titleMainGore;
        this.titleMainDolje = titleMainDolje;
        this.descMainGore = descMainGore;
        this.descMainDolje = descMainDolje;
    }

    public int getImageMainGore() {
        return imageMainGore;
    }

    public void setImageMainGore(int imageMainGore) {
        this.imageMainGore = imageMainGore;
    }

    public int getImageMainDolje() {
        return imageMainDolje;
    }

    public void setImageMainDolje(int imageMainDolje) {
        this.imageMainDolje = imageMainDolje;
    }

    public String getTitleMainGore() {
        return titleMainGore;
    }

    public void setTitleMainGore(String titleMainGore) {
        this.titleMainGore = titleMainGore;
    }

    public String getTitleMainDolje() {
        return titleMainDolje;
    }

    public void setTitleMainDolje(String titleMainDolje) {
        this.titleMainDolje = titleMainDolje;
    }

    public String getDescMainGore() {
        return descMainGore;
    }

    public void setDescMainGore(String descMainGore) {
        this.descMainGore = descMainGore;
    }

    public String getDescMainDolje() {
        return descMainDolje;
    }

    public void setDescMainDolje(String descMainDolje) {
        this.descMainDolje = descMainDolje;
    }
}
