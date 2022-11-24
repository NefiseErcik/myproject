public class Ogretmen extends Kisiler{
    private String sicilNo;

    public Ogretmen() {

    }

    public Ogretmen(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    public Ogretmen(String isim, String soyIsim, String tcNo, int dogumTarihi, String sicilNo) {
        super(isim, soyIsim, tcNo, dogumTarihi);
        this.sicilNo = sicilNo;
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;

    }

    @Override
    public String toString() {
        return "Ogretmen{" +
                "sicilNo='" + sicilNo + '\'' +
                "} " + super.toString();
    }
}
