package fishing.tackle.shop.ui.stapovi;

public class StapoviModel {

    private int imageStapovi;
    private String titleStapovi;
    private String priceStapovi;
    private int descStapovi;

    public StapoviModel(int imageStapovi, String titleStapovi, String priceStapovi, int descStapovi) {
        this.imageStapovi = imageStapovi;
        this.titleStapovi = titleStapovi;
        this.priceStapovi = priceStapovi;
        this.descStapovi = descStapovi;
    }

    public int getImageStapovi() {
        return imageStapovi;
    }

    public void setImageStapovi(int imageStapovi) {
        this.imageStapovi = imageStapovi;
    }

    public String getTitleStapovi() {
        return titleStapovi;
    }

    public void setTitleStapovi(String titleStapovi) {
        this.titleStapovi = titleStapovi;
    }

    public String getPriceStapovi() {
        return priceStapovi;
    }

    public void setPriceStapovi(String priceStapovi) {
        this.priceStapovi = priceStapovi;
    }

    public int getDescStapovi() {
        return descStapovi;
    }

    public void setDescStapovi(int descStapovi) {
        this.descStapovi = descStapovi;
    }
}
