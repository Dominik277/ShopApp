package fishing.tackle.shop;

public class UkupniDetailModel {

    private String imeDetail;
    private String prezimeDetail;
    private String adresaDetail;
    private String emailDetail;
    private String brojDetail;

    public UkupniDetailModel(String imeDetail, String prezimeDetail, String adresaDetail, String emailDetail, String brojDetail) {
        this.imeDetail = imeDetail;
        this.prezimeDetail = prezimeDetail;
        this.adresaDetail = adresaDetail;
        this.emailDetail = emailDetail;
        this.brojDetail = brojDetail;
    }

    public String getImeDetail() {
        return imeDetail;
    }

    public void setImeDetail(String imeDetail) {
        this.imeDetail = imeDetail;
    }

    public String getPrezimeDetail() {
        return prezimeDetail;
    }

    public void setPrezimeDetail(String prezimeDetail) {
        this.prezimeDetail = prezimeDetail;
    }

    public String getAdresaDetail() {
        return adresaDetail;
    }

    public void setAdresaDetail(String adresaDetail) {
        this.adresaDetail = adresaDetail;
    }

    public String getEmailDetail() {
        return emailDetail;
    }

    public void setEmailDetail(String emailDetail) {
        this.emailDetail = emailDetail;
    }

    public String getBrojDetail() {
        return brojDetail;
    }

    public void setBrojDetail(String brojDetail) {
        this.brojDetail = brojDetail;
    }
}
