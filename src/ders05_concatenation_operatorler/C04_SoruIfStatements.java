package ders05_concatenation_operatorler;

import java.util.Scanner;

public class C04_SoruIfStatements {
    public static void main(String[] args) {

        //Soru;Kullanicidan bir tam sayi isteyin,
        //sayiyi kontrol edip 5 ile bolunebiliyorsa,
        //"sayi 5'in tam kati yazdirin"

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir tam sayi giriniz");
        int say= scan.nextInt();

        if (say%5==0){
            System.out.println("Sayi 5'in tam kati");
        }

        //Soru 3- Kullanicidan bir sayi alin, sayi 3 ile bolunuyorsa
        //“Uc ile bolunebilen sayi”, 5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.

        if (say%3==0){
            System.out.println("Uc ile bolunebilen sayi");
        }
    }
}
