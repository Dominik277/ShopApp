package fishing.tackle.shop.ui.satori;

public class SatoriModel {

    private int imageSatori;
    private String titleSatori;
    private String cijenaSatori;

    public SatoriModel(int imageSatori, String titleSatori, String cijenaSatori) {
        this.imageSatori = imageSatori;
        this.titleSatori = titleSatori;
        this.cijenaSatori = cijenaSatori;
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

    public String getCijenaSatori() {
        return cijenaSatori;
    }

    public void setCijenaSatori(String cijenaSatori) {
        this.cijenaSatori = cijenaSatori;
    }
}
