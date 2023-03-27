package GenelTekrarSorular;

import java.util.Scanner;

public class GabfulFarkliCozum {
    public static void main(String[] args) {

        /*
        Örn: 12 Bir gapful değildir.
                Örn2 : 132 % 12 = 0 [Birini ve sonuncu basamağı alıp modunu alıyoruz]
        İşlem basamakları:
            * Kullanıcıdan en az 3 basamaklı bir sayı isteyin
            * Eğer 0 girerse programdan çıkın
                * Pozitif veya tam sayı değilse programdan çıkın
            * 3 Basamaklı bir sayı girildiyse, gapful kontrolü yapıp, sayının gapful olup olmadığını ekrana yazdırın
         */

         Scanner scan=new Scanner(System.in);
         int sayi=1;

         while(sayi!=0){
             System.out.println("3 basamakli sayi giriniz");
             sayi= scan.nextInt();

             if (sayi>=100 && sayi<=999){
                 int ilkBasamak=sayi/100;
                 int sonBasamak=sayi%10;
                 int gapfulSayi=Integer.parseInt(""+ilkBasamak+sonBasamak);

                 if (sayi%gapfulSayi==0){
                     System.out.println(sayi + " gapful bir sayidir");
                     break;
                 }else {
                     System.out.println(sayi + " gapful bir sayi degildir");
                 }
             } else if (sayi<0 || sayi==0 ) {
                 System.out.println("0 yada negatif bir sayi girdiniz \n" +
                         "Hata : Program Sonlandiriliyor");
                 break;
             } else {
                 System.out.println("3 basamakli sayi giriniz");
             }
         }
    }
}
