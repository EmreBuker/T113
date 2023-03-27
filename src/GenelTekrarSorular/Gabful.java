package GenelTekrarSorular;

import java.util.Scanner;

public class Gabful {
    public static void main(String[] args) {

        /*
            Gapful sayılar, en az 3 basamaklı olan ve ilk ve son basamağının birleşmesiyle ortaya çıkan sayıya bölümü 0 olan sayılardır.

            Örn: 12 Bir gapful değildir.
            Örn2 : 132 % 12 = 0 [Birini ve sonuncu basamağı alıp modunu alıyoruz]
            İşlem basamakları:
            * Kullanıcıdan en az 3 basamaklı bir sayı isteyin
            * Eğer 0 girerse programdan çıkın
            * Pozitif veya tam sayı değilse programdan çıkın
            * 3 Basamaklı bir sayı girildiyse, gapful kontrolü yapıp, sayının gapful olup olmadığını ekrana yazdırın
            Örn 3: 110,105,121 girildiğinde, en soldaki rakam 7, en sağdaki rakam 1.

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("3 basamakli pozitif bir tam sayi girin");
        int girilenSayi = scan.nextInt();

        int ilkSayi = girilenSayi / 100;
        int sonSayi = girilenSayi % 10;
        int gapfulSayi = Integer.parseInt("" + ilkSayi + sonSayi);


        if (girilenSayi==0 || girilenSayi<0){
            System.out.println("Program sonlandırıldı");
        } else if (girilenSayi < 100 || girilenSayi > 999) {
            System.out.println("Hata : 3 basamakli sayi giriniz");
        } else if (girilenSayi % gapfulSayi == 0) {
            System.out.println(girilenSayi + " gapful sayidir");
        }else System.out.println(girilenSayi + " gapful sayi degildir");
    }
}









