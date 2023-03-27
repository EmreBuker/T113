package ders10_StringManipulations;

public class C07_Substring {
    public static void main(String[] args) {

        String str= "Java gun gectikce guzellesiyor";

        System.out.println(str.substring(5,8));//gun , 5.karakterden 8.karakter arası, basi dahil sonu degil

        // gectikce yazdirin

        System.out.println(str.substring(9,17));//gectikce // aralik verildiginde ilk sayi dahil sonu degil

        String isim= "huseYIN";
        // verilen ismi ilk harfi buyuk, geriye kalanlar kucuk harf olarak kaydedin

        isim=isim.substring(0,1).toUpperCase()+//ilk harfi alip buyuk harf yaptik
                isim.substring(1).toLowerCase();//1.index ve sonrasi kucuk harf

        System.out.println(isim);//Huseyın

        System.out.println(isim.substring(2,5)); // aralik yazdigimizda ilk karakteri aliyor,son karakteri almiyor

        // sadece 3. indexdeki harfi yazdirin

        System.out.println(isim.substring(3,4));//e

        System.out.println(isim.substring(2, 2));


    }
}
