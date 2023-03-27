package ders06_IfElseStatements;

import java.util.Scanner;

public class C02_IfStatements {

    public static void main(String[] args) {
        //Soru: Kullanicidan bir ücgenin 3 kenar uzunlugunu alin
        //ucgen eskenar ise "Eskenar Ucgen" yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Uc kenar uzunlugunu giriniz");
        int Kenar1= scan.nextInt();
        int Kenar2= scan.nextInt();
        int Kenar3= scan.nextInt();

        if (Kenar1==Kenar2 && Kenar2==Kenar3){ //Java 3'lu karsilastirma yapamaz.ONEMLI
                                         // 3lu esitleme yaptigimizda hata vermedi fakat dikkate al
            System.out.println("Eskenar Ucgen");
        }else System.out.println("Eskenar Ucgen degil");

        }
    }

