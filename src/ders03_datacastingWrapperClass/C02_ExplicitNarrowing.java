package ders03_datacastingWrapperClass;

public class C02_ExplicitNarrowing {
    public static void main(String[] args) {

        int sayi=20 ;

        /* genis data turundeki bi degeri dar data turundeki bi veriable'a atamak isterseniz
        Java sorumlulugu sizin almanizi ister.Bunu yapmak icinse cast edeceginiz deger'in onune
        cast etmek istediginiz data turu ( ) icersinde yazilir.Ornek altta mevcut;

         */
        short sh=(short) sayi;
        System.out.println(sh);

        double dbl=23.5;
        int say=(int) dbl;
        System.out.println(say); //ondalikli sayiyi temsil eden double,tam sayiyi temsil eden int'a donustugunde
        //JAVA TARAFINDAN VIRGUL SONRASI CIKARILIR

      say=15;//int
        byte byt=(byte) say;

        System.out.println(byt); // byte'in sinirlari :'' -128 ve +128 arasi ''
        // byte'nin sinirlari icersinde oldugu icin sorunsuz yazdirdik.




    }
}
