package ders09_SwitchStatements;

import java.util.Scanner;

public class C04_SwitchStatements {
    public static void main(String[] args) {
        // Soru : Kullanicidan ay numarasini alip mevsimini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Ay numarasini giriniz");
        int ayNo= scan.nextInt();

        switch (ayNo){
            case 12:
            case 1:
            case 2:
                System.out.println("Kıs");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Ilkbahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Sonbahar");
                break;
            default:
                System.out.println("Gecersiz ay numarasi");






        }
    }
}
