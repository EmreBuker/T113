package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C06_Scanner {

    public static void main(String[] args) {
        // Soru 4 : Kullanicidan bir dikdortgenin iki kenar uzunlugunu alip,alanini yazdirin

       Scanner scan=new Scanner(System.in);

        System.out.println("iki kenar uzunluğu " +
                "\niki kenar arasinde enter'a basin");

        double birinciKenar= scan.nextDouble();
        double ikinciKenar=scan.nextDouble();

        System.out.println("dikdortgenin alani : " + birinciKenar*ikinciKenar);




    }
}
