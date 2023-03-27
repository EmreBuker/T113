package ders06_IfElseStatements;

import java.util.Scanner;

public class C11_OdevSorusu {
    public static void main(String[] args) {
        //kullanicidan bir sayi alin,sayi 3 ile bolunuyorsa "Uc ile bolunebilen sayi"
        //5 ile bolunebiliyorsa  "Bes ile bolunebilen sayi" yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int say= scan.nextInt();

        if (say%3==0){
            System.out.println("Uc ile bolunebilen sayi");
        }
        if (say%5==0){
            System.out.println("Bes ile bolunebilen sayi");
        }
    }
}
