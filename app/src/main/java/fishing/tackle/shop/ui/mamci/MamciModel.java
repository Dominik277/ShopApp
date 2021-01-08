package fishing.tackle.shop.ui.mamci;

public class MamciModel {

    private int imageMamci;
    private String titleMamci;
    private String descMamci;

    public MamciModel(int imageMamci, String titleMamci, String descMamci) {
        this.imageMamci = imageMamci;
        this.titleMamci = titleMamci;
        this.descMamci = descMamci;
    }

    public int getImageMamci() {
        return imageMamci;
    }

    public void setImageMamci(int imageMamci) {
        this.imageMamci = imageMamci;
    }

    public String getTitleMamci() {
        return titleMamci;
    }

    public void setTitleMamci(String titleMamci) {
        this.titleMamci = titleMamci;
    }

    public String getDescMamci() {
        return descMamci;
    }

    public void setDescMamci(String descMamci) {
        this.descMamci = descMamci;
    }
}
