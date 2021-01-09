package fishing.tackle.shop;

public class MainActivityModel {

    private int imageMain;
    private String titleMain;
    private String descMain;

    public MainActivityModel(int imageMain, String titleMain, String descMain) {
        this.imageMain = imageMain;
        this.titleMain = titleMain;
        this.descMain = descMain;
    }

    public int getImageMain() {
        return imageMain;
    }

    public void setImageMain(int imageMain) {
        this.imageMain = imageMain;
    }

    public String getTitleMain() {
        return titleMain;
    }

    public void setTitleMain(String titleMain) {
        this.titleMain = titleMain;
    }

    public String getDescMain() {
        return descMain;
    }

    public void setDescMain(String descMain) {
        this.descMain = descMain;
    }
}
