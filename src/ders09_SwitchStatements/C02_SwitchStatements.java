package ders09_SwitchStatements;

import java.util.Scanner;

public class C02_SwitchStatements {
    public static void main(String[] args) {
        // Soru ; Kullanicidan gün numarasini alip,gün ismini yazdiralim ?
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen gun numarasini giriniz");
        int gunNo=scan.nextInt();

        switch (gunNo){
            case 1 :
                System.out.println("Pazartesi");
                break;
            case 2 :
                System.out.println("Sali");
                break;
            case 3:
                System.out.println("Carsamba");
                break;
            case 4 :
                System.out.println("Persembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default :
                System.out.println("Gecersiz gun numarasi");


        }


    }
}
