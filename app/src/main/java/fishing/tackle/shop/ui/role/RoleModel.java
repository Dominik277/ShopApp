package fishing.tackle.shop.ui.role;

public class RoleModel {

    private int imageRole;
    private String titleRole;
    private String descRole;

    public RoleModel(int imageRole, String titleRole, String descRole) {
        this.imageRole = imageRole;
        this.titleRole = titleRole;
        this.descRole = descRole;
    }

    public int getImageRole() {
        return imageRole;
    }

    public void setImageRole(int imageRole) {
        this.imageRole = imageRole;
    }

    public String getTitleRole() {
        return titleRole;
    }

    public void setTitleRole(String titleRole) {
        this.titleRole = titleRole;
    }

    public String getDescRole() {
        return descRole;
    }

    public void setDescRole(String descRole) {
        this.descRole = descRole;
    }
}
