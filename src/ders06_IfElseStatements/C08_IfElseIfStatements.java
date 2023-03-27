package ders06_IfElseStatements;

import java.util.Scanner;

public class C08_IfElseIfStatements {
    public static void main(String[] args) {
        //Soru: Kullanicidan bir ücgenin 3 kenar uzunlugunu alin
        //Kenar uzunluklari 0 veya negatifse "Gecersiz Kenar Uzunlugu" yazin
        //        //ucgen eskenar ise "Eskenar Ucgen" yazdirin

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen ucgenin 3 kenarini giriniz");

        int Kenar1= scan.nextInt();
        int Kenar2= scan.nextInt();
        int Kenar3=scan.nextInt();

        if (Kenar1<=0 || Kenar2<=0 || Kenar3 <=0){
            System.out.println("Gecersiz Kenar Uzunlugu");
        } else if (Kenar1==Kenar2 && Kenar2==Kenar3){
            System.out.println("Eskenar Ucgen");
        }else{
            System.out.println("Eskenar Ucgen Degil");
        }
    }
}
