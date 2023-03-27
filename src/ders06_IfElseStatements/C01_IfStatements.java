package ders06_IfElseStatements;

import java.util.Scanner;

public class C01_IfStatements {
    public static void main(String[] args) {

        //Soru : Kullanicidan bir harf alin.Harf ile baslayan bir ay varsa yazdirin
        // kullanici o veya 0 yazdiginda output Ocak olsun

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir harf giriniz");
        char harf=scan.next().charAt(0);

        if (harf=='o' || harf=='O'){
            System.out.println("Ocak");
        }if (harf=='m' || harf=='M'){
            System.out.println("Mart veya Mayis");
        }if (harf=='k'||harf=='K'){
            System.out.println("Kasim");

        } // gibi devam eder ..


    }
}
