package ders13_forLoops;

public class C05_DikkatEdilecekler {
    public static void main(String[] args) {

        //for (int i = 0; i >  -10; i++) {
            //System.out.println(i + " "); // sonsuz loop

        for (int i = 0; i > 10; i++) {
            System.out.println(i); // ilk deger icin bitis sarti true olmuyorsa
                                    // kod calisir fakat for body'si devreye girmez

        }

        // bir loop'u sonunu beklemeden bitirmek istersek

        // kullanicinin verdigi bir sayinin asal sayi olup olmadigini bulun ??

        int sayi=53;
        boolean bayrak=false; // bayrak olusturduk (final), asal sayi mi anlaminda .MUTLAKA BAYRAK OLMALİ

        for (int i = 2; i < sayi-1; i++) {

            if (sayi%i==0){
                //olay biter
                bayrak=true; // yazilmasi sart
                break; // ayni switch mantigindaki gibi tek bir bolunen buldugunda
                      // durmasi,devam etmemesi icin break koyduk
                      // break sart degil yazmasakta kod calisir fakat onemli


            }
        }

        System.out.println(bayrak);

        if (bayrak){
            System.out.println("asal sayi degil");
        }else{
            System.out.println("asal sayi");
        }

    }
}
