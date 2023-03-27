package ders13_forLoops;

public class C03_Faktoryel {
    public static void main(String[] args) {

        // kullanicinin verdigi sayinin faktoryelini bulalim

        // 5!=5*4*3*2*1 demek oluyodu , 120
        int sayi=10;
        int faktoryel=1; // rastgele degeri 0 degil 1 yapmamız gerekti carpma islemi oldugu icin

        for (int i = sayi; i >= 1; i--) { // ONEMLI .. her faktoriyel evresinde bir alt degerini alcagi icin
                                          // eksi -- deger yaptik
            faktoryel=faktoryel*i ;

        }
        System.out.println(faktoryel);

        //1'Den 100'e kadar olan sayilari toplayin

        int toplam=0; // toplama islemi oldugu icin 0'da olur

        for (int i = 1; i <=100; i++) {

            toplam=toplam+i;

        }

        System.out.println(toplam); // ONEMLI !! for loop icine koymadik cunku ;
                                    // islemleri ve ara sonuclarida yazdiriyo
                                    // o yuzden parantez disina yaziyoruz

    }
}
