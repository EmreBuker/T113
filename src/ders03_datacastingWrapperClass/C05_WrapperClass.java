package ders03_datacastingWrapperClass;

public class C05_WrapperClass {
    public static void main(String[] args) {
        /*
        primitive data türleri Sadece değer taşırken,
        non primitive data türlerinde methotlarda oluyordu

        Fakat Java primitive data türlerinde hazır methodlar
        kullanılması için WrapperClass’lar oluşturmuştur
         */

        char krk='b';

        Character krkWrapper='c';
        System.out.println(Character.isLetter('5'));//false// letter harf demek
        System.out.println(Character.isDigit('7'));//true //  digit sayi demek

        String str1="123";
        String str2="12";// str'in ve str'in degerlerini matematiksel olarak toplayin ?
        System.out.println(str1+str2);
        System.out.println(Integer.parseInt(str1)+Integer.parseInt(str2));//Integer.parseInt methodu string dataları
                                                                          //int hale getiriyor. Integer yazdigimizda
                                                                          //WrapperClass olarak methotlar cikmakta.
                                                                          //Fakat tum karakterler rakam olmali

        System.out.println(Integer.MAX_VALUE);//Hazir methodlarda integerin max degeri
        System.out.println(Integer.MIN_VALUE);

    }
}
