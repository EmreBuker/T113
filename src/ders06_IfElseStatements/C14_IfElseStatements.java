package ders06_IfElseStatements;

import java.util.Scanner;

public class C14_IfElseStatements {
    public static void main(String[] args) {

        //Kullanicidan notunu alin 50 veya daha buyukse "Sınıfı Gectin"
        //50'den kucukse "Maalesef Kaldin" yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Notunuzu giriniz");
        double not= scan.nextDouble();

        if (not>=50){
            System.out.println("Sınıfı Gectin");
        }else System.out.println("Maalesef Kaldin");



        //Kullanicidan pozitif bir tamsayi alin
        //sayinin tek veya cift sayi oldugunu yazdirin
        System.out.println("Bir tamsayi giriniz");
        int sayi= scan.nextInt();

        if (sayi%2==0){
            System.out.println("Cift Sayi");
        }else System.out.println("Tek Sayi");



        //Kullanicidan pozitif bir tamsayi alin
        //5 ile bolunup bolunmedigini yazdirin

        System.out.println("Bir tam sayi giriniz");
        int s2= scan.nextInt();

        if (s2%5==0){
            System.out.println("5 ile tam bolunebiliyor");
        }else System.out.println("5 ile tam bolunemiyor");
    }
}
