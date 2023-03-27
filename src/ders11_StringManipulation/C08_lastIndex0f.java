package ders11_StringManipulation;

public class C08_lastIndex0f {
    public static void main(String[] args) {

        String str="Java hafiften beyin yakiyor";
        System.out.println(str.lastIndexOf("a"));//aramaya sondan basliyor fakat index'i bastan
                                                     //sayarak veriyor // 21
        System.out.println(str.lastIndexOf('e')); // 15 // char olarakta olabiliyor

        System.out.println(str.lastIndexOf("java"));// kucuk harfle j oldugu icin -1
        System.out.println(str.lastIndexOf("Java"));// ilk index kelimeyi buldugu yer yani 0 oluyor

        System.out.println(str.lastIndexOf("e", 14));// aramaya 14'ten basliycak // 11


    }
}
