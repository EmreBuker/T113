package ders09_SwitchStatements;

import java.util.Scanner;

public class C03_SwitchStatements {
    public static void main(String[] args) {
        // Soru : Kullanicidan gun numarasini alip,haftaici veya haftasonu yazdirin ?

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen gun numarasini giriniz");
        int gunNo=scan.nextInt();

        switch (gunNo){
            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
                System.out.println("Haftaici");
                break;
            case 6:
            case 7:
                System.out.println("HaftaSonu");
                break;
            default :
                System.out.println("Gecersiz gun numarasi");

        }  // Bi nevi case'lari gruplandirma yaptik

    }
}
