package ders15_methodOlusturma;

public class C07_AsalsayiDondur {

    // Soru 3- Kullanicidan main method icinde pozitif bir tamsayi alin.
    // Girilen sayinin asal sayi olup olmadigini kontrol edip,
    // sonuc olarak “asal sayi” veya “asal sayi degil” sonuclarini donduren bir method olusturun.

    public static void main(String[] args) {

        int sayi=24;
        System.out.println(asalSayiKontrolEt(sayi));
        System.out.println(asalSayiKontrolEt(23));


    }

    public static String asalSayiKontrolEt(int sayi){
        String sonuc="Asal";

        for (int i = 2; i <(sayi-1) ; i++) {
            if (sayi%i==0){
                sonuc="Asal degil";

            }
        }
        return sonuc;

    }
}
