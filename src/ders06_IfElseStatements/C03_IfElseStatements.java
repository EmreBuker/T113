package ders06_IfElseStatements;

import java.util.Scanner;

public class C03_IfElseStatements {
    public static void main(String[] args) {
        //Soru: Kullanicidan bir ücgenin 3 kenar uzunlugunu alin
        //        //ucgen eskenar ise "Eskenar Ucgen" yazdirin

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen ucgenin 3 kenarini giriniz");

        int Kenar1= scan.nextInt();
        int Kenar2= scan.nextInt();
        int Kenar3=scan.nextInt();

        if (Kenar1==Kenar2 && Kenar2==Kenar3){

            System.out.println("Eskenar Ucgen");

        }
        else {
            System.out.println("Maalesef Eskenar Ucgen Degil");
        }
    }
}
