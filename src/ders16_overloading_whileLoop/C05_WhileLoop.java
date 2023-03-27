package ders16_overloading_whileLoop;

import java.util.Scanner;

public class C05_WhileLoop {
    public static void main(String[] args) {

        /*
          Kullanicidan toplanmak uzere sayi alin
          sayilarin toplami 500'e esit olur veya gecerse
          girilen sayi adedi,
          girilen sayilarin toplamini ve
          "Bu kadar yeter" yazdirin
         */

        Scanner scan=new Scanner(System.in);

        double toplam=0; // girilen sayiların toplamini istedigi icin
        double girilenSayi=0; //
        int sayac=0; // girilen sayi adedi icin

        while (toplam<500){ // 500'e kadar okey,500e geldiginde ve ya gectiginde durdurcagımız icin boyle yaptik

            System.out.println("Toplamak icin sayi giriniz"); // Eğer while icin sout yazmaksak
                                                              // tek bir sefer dondurur
                                                              // bize birçok defa dondurmesi lazım
            girilenSayi= scan.nextDouble();
            toplam+=girilenSayi; // eski toplama girilen sayiyi tekrar ekle anlamında
            sayac++;

        }
        System.out.println("Girilen" + sayac +"sayinin toplami "+toplam +" oldu. Bu kadar yeterli");

    }
}
