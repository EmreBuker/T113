package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C08_Scanner {

    public static void main(String[] args) {
        // Soru : Kullanicidan iki sayi alip,ikisinin değerlerini degistirin (swap)
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen birinci tam sayiyi giriniz");
        int sayi1= scan.nextInt();
        System.out.println("Lutfen ikinci tam sayiyi giriniz");
        int sayi2= scan.nextInt();

        //Deger degisikliği icin soyle bi ornek verebiliriz.Bi kovada su bi kovada kum var
        //ise bunlarin yerini degistirmemiz icin haliyle ucuncu bi kovaya ihtiyacimiz vardir.
        //Bu mantiga gore ilerlersek ;

        int bos;
        bos=sayi2;
        sayi2=sayi1;
        sayi1=bos;

        System.out.println("sayi1'in degeri : "+ sayi1);
        System.out.println("sayi2'in degeri : "+ sayi2);

    }
}
