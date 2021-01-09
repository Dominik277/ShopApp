package fishing.tackle.shop.ui.mamci;

public class MamciModel {

    private int imageMamci;
    private String titleMamci;
    private String cijenaMamci;

    public MamciModel(int imageMamci, String titleMamci, String cijenaMamci) {
        this.imageMamci = imageMamci;
        this.titleMamci = titleMamci;
        this.cijenaMamci = cijenaMamci;
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

    public String getCijenaMamci() {
        return cijenaMamci;
    }

    public void setCijenaMamci(String cijenaMamci) {
        this.cijenaMamci = cijenaMamci;
    }
}
