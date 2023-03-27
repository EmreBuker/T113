package ders13_forLoops;

public class C07_Soru {
    public static void main(String[] args) {

        /*
        Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
         */

        int bas=50;
        int bit=450;

        int sayiToplami=0;

        if (bit<bas){
            System.out.println("baslangic degeri bitis degerinden kucuk olmali");
        }else {
            for (int i = bas; i <= bit; i++) { // bas-bit yapmamizin sebebi kodun dinamik olmasi icin gerekli
                                                // bu yüzden 20-40 yazmadik !

                sayiToplami =sayiToplami+ i;


            }

        }

        System.out.println("Sayilarin Toplami : "+sayiToplami);






    }
}
