package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C09_OdevYapildiFakatSorulsun {
    //Odev Sorusu ; 8.ornekte olduğundan biraz daha farkli olarak kullanicidan iki sayi alip
    //ucuncu bir degisken kullanmadan ikisinin degerlerini degistirin

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("birinci sayiyi girin");
        int sayi1 = scan.nextInt();
        System.out.println("ikinci sayiyi girin"); // Misalen sayi1=20 , sayi2=10 olsun
        int sayi2= scan.nextInt();

        sayi1=sayi1+sayi2;//30
        sayi2=sayi1-sayi2;//10
        sayi1=sayi1-sayi2;//10

        System.out.println("sayi1'in degeri"+sayi1);
        System.out.println("sayi2'in degeri"+sayi2);














        System.out.println("sayi1'in degeri : "+ sayi1);
        System.out.println("sayi2'in degeri : "+sayi2);

    }
}
