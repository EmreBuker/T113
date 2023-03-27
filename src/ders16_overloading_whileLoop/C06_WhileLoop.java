package ders16_overloading_whileLoop;

import java.util.Scanner;

public class C06_WhileLoop {
    public static void main(String[] args) {

        /*
        Soru : Kullanicidan sifre isteyin asagidaki sartlari saglamayan sifrelerde hatalari yazdirip,
        kullanicinin yeni sifre girmesi isteyin
        Gecerli bir sifre yazilincaya kadar bu islemi tekrar edin
        gecerli sifre yazilinca “sifreniz basari ile kaydedildi” yazdirin
        sartlar :
        - sifrenin ilk karakteri kucuk harf olmali
        - sifrenin son karakteri sayi olmali

         */

        Scanner scan=new Scanner(System.in);
        boolean sifreGecerliMi=false;
        String sifre="";

        while (sifreGecerliMi!=true){

            System.out.println("Sifrenizi giriniz");
            sifre= scan.nextLine();
            int bayrak=0;

            if (!(sifre.charAt(0)>='a' && sifre.charAt(0)<='z')){
                System.out.println("sifrenin ilk karakteri kucuk harf olmali");
                bayrak++;
            }
            if (!(sifre.charAt(sifre.length()-1)>'1'&& sifre.charAt(sifre.length()-1)<='9')){
                System.out.println("sifrenin son karakteri sayi olmali");
                bayrak++;
            }
            if (bayrak==0){
                sifreGecerliMi=true;
                System.out.println("sifreniz basariyla kaydedildi");
            }
        }
    }
}
