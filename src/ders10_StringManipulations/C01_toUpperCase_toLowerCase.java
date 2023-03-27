package ders10_StringManipulations;

public class C01_toUpperCase_toLowerCase {
    public static void main(String[] args) {

        String ch="merhaba emre buker nasilsin";

        System.out.println("Buyuk Harf Yazımı : " + ch.toUpperCase());
        System.out.println("Kucuk Harf Yazımı : " + ch.toLowerCase());


        String str="Java Mutluluktur";// Cok onemli degil fakat yukaridakinden farkli olarak
                                      // su sekilde de yapilabilir

        str=str.toUpperCase();
        System.out.println(str);
        str=str.toLowerCase();
        System.out.println(str);

        String eb="Java Candır";

        System.out.println(eb.toUpperCase());
        System.out.println(eb); // kalici olarak kalmasini istiyorsak atama yapmaliyiz

    }
}
