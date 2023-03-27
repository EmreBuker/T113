package ders09_SwitchStatements;

import java.util.Scanner;

public class C06_OdevSwitch {
    public static void main(String[] args) {
        //Soru : Kullanicidan iki basamakli sayi alip,girilen sayiyi yazi ile yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("İki basamakli sayi giriniz");
        int sayi= scan.nextInt();

        switch (sayi){
            case 50:
                System.out.println("Elli");
                break;
            case 51:
                System.out.println("ElliBir");
                break;
            case 84:
                System.out.println("Seksendort");
                break;
            case 76:
                System.out.println("Yetmisalti");
                break;
                // ...
            default:
                System.out.println("Gecersiz sayi");












        }

    }
}
