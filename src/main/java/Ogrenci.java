public class Ogrenci extends Kisiler{
   private String okulNo;

   public Ogrenci() {
   }

   public Ogrenci(String okulNo) {
      this.okulNo = okulNo;
   }

   public Ogrenci(String isim, String soyIsim, String tcNo, int dogumTarihi, String okulNo) {
      super(isim, soyIsim, tcNo, dogumTarihi);
      this.okulNo = okulNo;
   }

   public String getOkulNo() {
      return okulNo;
   }

   public void setOkulNo(String okulNo) {
      this.okulNo = okulNo;
   }

   @Override
   public String toString() {
      return "Ogrenci{" +
              "okulNo='" + okulNo + '\'' +
              "} " + super.toString();
   }
}
