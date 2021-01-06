package fishing.tackle.shop.ui.stapovi;

public class Model {

    private int image;
    private String title;
    private String price;
    private String desc;

    public Model(int image, String title,String price, String desc) {
        this.image = image;
        this.title = title;
        this.price = price;
        this.desc = desc;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
