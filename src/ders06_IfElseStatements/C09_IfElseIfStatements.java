package ders06_IfElseStatements;

import java.util.Scanner;

public class C09_IfElseIfStatements {
    public static void main(String[] args) {
        //kullanicidan bir tam sayi alin
        //sayi negatifse "gecersiz sayi"
        //tek basamakli ise "rakam"
        //iki basamkli ise "iki basamakli sayi"
        //bunun disindaki sayilar icin "buyuk sayi"  yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("bir tam sayi giriniz");
        int say= scan.nextInt();
        
        if (say<0){
            System.out.println("gecersiz sayi");
        } else if (say<10) {
            System.out.println("rakam");
        } else if (say<100) {
            System.out.println("iki basamakli sayi");
        }else System.out.println("büyük sayi");
    }
}