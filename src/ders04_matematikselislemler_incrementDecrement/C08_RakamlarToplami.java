package ders04_matematikselislemler_incrementDecrement;

import java.util.Scanner;

public class C08_RakamlarToplami {

    public static void main(String[] args) {
        // Soru : Kullanicidan 3 basamakli bir sayi alin ve sayinin rakamlar toplamini yazdirin ?

        Scanner scan=new Scanner(System.in);
        System.out.println("3 basamakli bir tam sayi giriniz");

        int girilenSayi= scan.nextInt(); //135 mesela
        int rakam= girilenSayi % 10;//5
        int rakamlarToplami= rakam;


        girilenSayi= girilenSayi / 10;
        rakam = girilenSayi % 10;
        rakamlarToplami = rakamlarToplami + rakam;

        girilenSayi= girilenSayi / 10; // 13 / 10 ===> 1
        rakam = girilenSayi % 10;
        rakamlarToplami= rakamlarToplami + rakam;

        System.out.println(rakamlarToplami);








    }
}
