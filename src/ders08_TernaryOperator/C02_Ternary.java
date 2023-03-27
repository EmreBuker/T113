package ders08_TernaryOperator;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {

        // Soru ; Kullanicidan bir harf isteyin,girilen karakter kucuk harf ise
        // onu buyuk harf olarak yazdirin,yoksa girilen harfi yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir harf giriniz");
        char krk=scan.next().charAt(0);

        System.out.println(krk>='a' && krk<='z' ? (char) (krk-32) : krk); // ASCII tablosunda kucuk buyuk harf arasındaki
                                                                 //deger farkı 32. kucuk harf 32 daha fazla oldugu icin
                                                                 //buyuk harfe donusturmek icin 32 cikardik

        // ONEMLİ : Char ifadeler matematiksel islemlerde kullanilirsa ASCII tablosundaki matematiksel degeri yazar
        // O yuzden krk-32 yi paranteze alip basina char karakterini yazmaliyiz
    }
}
