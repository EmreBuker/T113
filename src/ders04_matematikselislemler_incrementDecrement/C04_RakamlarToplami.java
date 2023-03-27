package ders04_matematikselislemler_incrementDecrement;

public class C04_RakamlarToplami {
    public static void main(String[] args) {
        //Soru : kullanicinin girdigi 4 basamakli sayinin rakamlar toplamini veren
        //bir kod yaziniz

        /*
        Önemli Bir Bilgi. Her seferinde Scanner oluşturup kullanıcıdan bilgi almak yerine
        alternatif olarak ‘ int input ‘ yapabiliriz
         */
        int input=1453 ;

        int birlerBasamagi=0; // hata vermesin diye etki etmiycek bi deger atadik
        int rakamlarToplami=0;

        birlerBasamagi=input % 10; // birler basamagini aldik
        rakamlarToplami=rakamlarToplami+birlerBasamagi; // 3
        input=input / 10 ; //birler basamagindan kurtul

        birlerBasamagi=input % 10; // birler basamagini aldik
        rakamlarToplami=rakamlarToplami+birlerBasamagi; // 5
        input=input / 10 ; //birler basamagindan kurtul

        birlerBasamagi=input % 10; // birler basamagini aldik
        rakamlarToplami=rakamlarToplami+birlerBasamagi; // 4
        input=input / 10 ; //birler basamagindan kurtul

        birlerBasamagi=input % 10; // birler basamagini aldik
        rakamlarToplami=rakamlarToplami+birlerBasamagi; // 1
        input=input / 10 ; //birler basamagindan kurtul     // 4 basamakli sayi oldugu icin islemi 4 defa yaptik

        System.out.println("verilen sayinin rakamlar toplami : " + rakamlarToplami);











    }
}
