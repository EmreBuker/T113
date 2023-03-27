package ders11_StringManipulation;

public class C06_index0f {
    public static void main(String[] args) {

        String str="Ahmet hoca ile hersey clear";

        System.out.println(str.indexOf("a"));// int olarak bi deger yazdiriyor
                                             //ilk a'nin index'ini yazdirir , 9

        System.out.println(str.indexOf('c')); // char olarakta kabul ediyor , 8

        System.out.println(str.indexOf("hersey")); // Hangi index ten basliyorsa onu yazdirir , 15

        System.out.println(str.indexOf("e",9)); // 9.indexten sonra baslayip e'yi ariyor , 13

        //13.index'deki e'den bir sonraki e'nin index'ini bulalim

        System.out.println(str.indexOf("e",14)); // 16

        // cumledeki 2.c'nin indexini yazdirin

        int ilkcindex=str.indexOf("c");// 8

        System.out.println(str.indexOf("c",ilkcindex+1)); // 22

        System.out.println(str.indexOf("ali")); // int yani sayi dondurmesi gerekiyo
                                               // olmayan bi index aratildiginda -1 donuyor
    }
}
