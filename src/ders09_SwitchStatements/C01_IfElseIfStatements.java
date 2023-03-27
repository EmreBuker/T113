package ders09_SwitchStatements;

import java.util.Scanner;

public class C01_IfElseIfStatements {
    public static void main(String[] args) {
        // Soru ; Kullanicidan gün numarasini alip,gün ismini yazdiralim ?

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen gun numarasini giriniz");
        int gunNo=scan.nextInt();

        if (gunNo==1) {
            System.out.println("Pazartesi");

        }else if (gunNo==2) {
            System.out.println("Salı");

        }else if (gunNo==3) {
            System.out.println("Carsamba");

        }else if (gunNo==4) {
            System.out.println("Persembe");

        }else if (gunNo==5) {
            System.out.println("CUma");

        }else if (gunNo==6) {
            System.out.println("Cumartesi");

        }else if (gunNo==7) {
            System.out.println("Pazar");

        }else System.out.println("Gecersiz gun numarasi");


    } // bunu Switch te farklı yapicaz !!
}
