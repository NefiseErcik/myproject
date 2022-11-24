public class Runner {



    public static void main(String[] args) {
        Ogretmen ogretmen=new Ogretmen();
        ogretmen.setIsim("nefise");
        ogretmen.setSoyIsim("ercik");
        ogretmen.setTcNo("26598745213");
        ogretmen.setDogumTarihi(1984);
        System.out.println(ogretmen);
        System.out.println(ogretmen.getIsim());
    }

}
