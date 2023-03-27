package ders09_SwitchStatements;

import java.util.Scanner;

public class C05_OdevSwitch {
    public static void main(String[] args) {
        //Soru ; Kullanicidan ISTQB kisaltmasindan harfin anlamini ogrenmek istedigini alin
        // ve girilen harfin karsiligini yazdirin
        //I : International S:Software T:Testing Q:Qualifications B:Board

        Scanner scan=new Scanner(System.in);
        System.out.println("ISTQB kisaltmasindaki harfleri giriniz");
        char harf=scan.next().charAt(0);

        switch (harf){
            case 'I':
            case'ı':
                System.out.println("International");
                break;
            case 'S':
            case's':
                System.out.println("Software");
                break;
            case 'T':
            case't':
                System.out.println("Testing");
                break;
            case 'Q':
            case'q':
                System.out.println("Qualifications");
                break;
            case 'B':
            case'b':
                System.out.println("Board");
                break;
            default:
                System.out.println("Hatalı giris");












        }
    }
}
