package fishing.tackle.shop.ui.role;

public class RoleModel {

    private int imageRole;
    private String titleRole;
    private String cijenaRole;

    public RoleModel(int imageRole, String titleRole, String cijenaRole) {
        this.imageRole = imageRole;
        this.titleRole = titleRole;
        this.cijenaRole = cijenaRole;
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

    public String getCijenaRole() {
        return cijenaRole;
    }

    public void setCijenaRole(String cijenaRole) {
        this.cijenaRole = cijenaRole;
    }
}
