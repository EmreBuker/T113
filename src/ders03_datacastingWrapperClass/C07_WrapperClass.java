package ders03_datacastingWrapperClass;

import javax.swing.text.html.HTMLDocument;

public class C07_WrapperClass {
    public static void main(String[] args) {
         /*
        primitive data türleri Sadece değer taşırken,
        non primitive data türlerinde methotlarda oluyordu

        Fakat Java primitive data türlerinde hazır methodlar
        kullanılması için WrapperClass’lar oluşturmuştur

        int==>Integer
        char==>Character
        byte==>Byte
        boolean==>Boolean

          */

        String sonucStr="345";

        System.out.println(sonucStr+10); // Stringe ifade oldugu icin sonuc 34510 yazdirir
        //bu durumda WrapperClass lar kullanilir

        int sonuc=Integer.parseInt(sonucStr);// yada Integer.valueOf kullanabilirdik fakat
                                            // tamamen rakam olmasi gerekir

        System.out.println(sonuc+10);

        char krk='3';




    }
}
