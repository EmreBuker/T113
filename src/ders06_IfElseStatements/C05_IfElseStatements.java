package ders06_IfElseStatements;

import java.util.Scanner;

public class C05_IfElseStatements {
    public static void main(String[] args) {
        //Kullanicidan yasini isteyin,65 yas ve uzeri ise "Emekli Olbilirsin" yazdirin
        //yoksa Emekli olmasi icin calismasi gereken yil sayisini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("yasinizi yaziniz");
        int yas= scan.nextInt();

        if (yas >=65){
            System.out.println("Yasiniz Emeklilik icin Yeterli");

        }else {
            System.out.println("Emekli olabilmek icin " + (65-yas) + " sene daha calismalisin");
        }
    }
}
