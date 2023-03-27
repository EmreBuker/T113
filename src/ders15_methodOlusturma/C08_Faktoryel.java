package ders15_methodOlusturma;

import java.util.Scanner;

public class C08_Faktoryel {
    public static void main(String[] args) {

        // verdigimiz bir sayinin faktoryelini hesaplayip
        // sonucu bize donduren bir method olusturun

       Scanner scan=new Scanner(System.in);
       System.out.println("Bir sayi giriniz");
       int sayi= scan.nextInt();

        System.out.println(faktoryelHesapla(sayi));

    }

    public static int faktoryelHesapla(int sayi){

        int faktoryelSonuc=1;

        for (int i = sayi; i >=1 ; i--) {

            faktoryelSonuc*=i;

        }
        return faktoryelSonuc;

    }
}
