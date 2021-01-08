package fishing.tackle.shop.ui.satori;

public class SatoriModel {

    private int imageSatori;
    private String titleSatori;
    private String descSatori;

    public SatoriModel(int imageSatori, String titleSatori, String descSatori) {
        this.imageSatori = imageSatori;
        this.titleSatori = titleSatori;
        this.descSatori = descSatori;
    }

    public int getImageSatori() {
        return imageSatori;
    }

    public void setImageSatori(int imageSatori) {
        this.imageSatori = imageSatori;
    }

    public String getTitleSatori() {
        return titleSatori;
    }

    public void setTitleSatori(String titleSatori) {
        this.titleSatori = titleSatori;
    }

    public String getDescSatori() {
        return descSatori;
    }

    public void setDescSatori(String descSatori) {
        this.descSatori = descSatori;
    }
}
