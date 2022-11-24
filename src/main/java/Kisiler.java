public class Kisiler {
    private String isim;
    private String soyIsim;
    private String tcNo;
    private int dogumTarihi;

    public Kisiler() {
    }

    public Kisiler(String isim, String soyIsim, String tcNo, int dogumTarihi) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.tcNo = tcNo;
        this.dogumTarihi = dogumTarihi;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public int getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(int dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {
        return "Kisiler{" +
                "isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", tcNo='" + tcNo + '\'' +
                ", dogumTarihi=" + dogumTarihi +
                '}';
    }
    //yorum
}
