package ders11_StringManipulation;

import java.util.Scanner;

public class C05_Soru {
    public static void main(String[] args) {
        /*
        mail kontrolu yapan bir program hazirlayin
        1-mail @ isareti icermiyorsa "gecersiz email" yazdiralim
        2-@gmail.com icermiyorsa "gmail adresi giriniz" yazdirin
        3-@gmail.com ile bitmiyorsa "yazim hatasi" yazdiralim
         */

        String email="emrebuker01@gmail.com";

        if (!email.contains("@")){
            System.out.println("Gecersiz email");
        } else if (!email.contains("gmail.com")) {  // olumlu ibareler oldugu icin hepsini negatif anlama
                                                    // getirme sebebiyle baslarina ! koyduk
            System.out.println("Gmail adresi giriniz");
        } else if (!email.endsWith("@gmail.com")) {
            System.out.println("Yazim hatasi");

        }else System.out.println("Email basari ile kaydedildi");

    }
}
