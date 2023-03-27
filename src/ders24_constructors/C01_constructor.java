package ders24_constructors;

import java.util.Scanner;

public class C01_constructor {
    public static void main(String[] args) {

        // Scanner class'indaki method ve variable'lari(ozellikleri) kullanmak icin scan objesi olustururuz
        Scanner        scan      =            new Scanner(System.in);
        //  class adi    obje ismi     obje olusturmak icin keyword         Scanner Constructor'i

        scan.nextInt();


        String str = new String("Java Candir");
        String str2= "Java ne guzel";

        str.toLowerCase();
        // bir obje ancak bir class'dan olusturulabilir
        // eger bir programda ortak ozelliklere sahip objeler uretmez uzere tasarladiginiz bir class varsa
        // main method olmasi sart degildir

        C02_Hemsire hemsire1=new C02_Hemsire(); // C02_Hemsire() bu constructor
        System.out.println(hemsire1.mesaiUcretiHesapla(5));

    }

    public static void C01_constructor(){
        // method isimleri kucuk harfle baslar
        // class ismi ile ayni isimde olmamasi tercih edilir
        // return type var method'dur, constructor olamaz

    }
}
