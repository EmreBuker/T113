package ders04_matematikselislemler_incrementDecrement;

import java.util.Scanner;

public class C09_KendimeOdevRakamlarToplami {

    public static void main(String[] args) {
        // Soru : Kullanicidan 3 basamakli bir sayi alin ve sayinin rakamlar toplamini yazdirin ?

        Scanner scan=new Scanner(System.in);
        System.out.println("3 basamakli bir sayi giriniz");
        int sayi= scan.nextInt();//444
        int birlerBasamagi=sayi%10;
        int rakamlarToplami=birlerBasamagi;//4
        sayi=sayi/10;
        birlerBasamagi=sayi%10;
        rakamlarToplami=birlerBasamagi+rakamlarToplami;//8
        sayi=sayi/10;
        birlerBasamagi=sayi%10;
        rakamlarToplami=birlerBasamagi+rakamlarToplami;

        System.out.println("rakamlar toplami : " + rakamlarToplami);










    }
}
