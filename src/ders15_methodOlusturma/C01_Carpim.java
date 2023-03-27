package ders15_methodOlusturma;

import java.util.Scanner;

public class C01_Carpim {

    // main method icerisinde kullanicidan iki sayi alin
    // bu iki sayiyi parametre olarak kabul edip, carpimlarini main method'a döndüren bir method olusturun

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("İki sayi giriniz");
        double say1= scan.nextDouble();
        double say2= scan.nextDouble();
        System.out.println(carpim(say1,say2)); // buraya direk sayilari yazabilirdik
                                               // methodu carpim diyerek cağırdık ve yazdırdık
    }

    public static double carpim(double say1,double say2){

        return say1*say2;
    }


}
