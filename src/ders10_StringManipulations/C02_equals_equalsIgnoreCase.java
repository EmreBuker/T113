package ders10_StringManipulations;

public class C02_equals_equalsIgnoreCase {
    public static void main(String[] args) {

        String str1="Ali";
        String str2="ali";

        String str3= new String("Ali");
        String str4= "Ali";
        /*
        == anlam olarak ; Nesnelerin adresleri ayni mi degil mi ?
        .equals() ; Nesnelerin içeriğin ayni mi degil mi ? Kontrol eder ..
         */
        System.out.println(str1==str2);//false
        System.out.println(str1==str3);//false
        System.out.println(str1==str4);//true

        // == String'leri karsilastirirken bekledigimiz sonuclari vermeyebilir
        //String'lerde metinlerin ayni olup olmadigini karsilastirmak icin
        //== yerine equals() kullanilir.

        /*
         equalsIgnoreCase  ayni metnin buyuk kucuk harf kullanilarak olusturulan
         farkli yazimlarini birbirine esit olarak kabul eder
         yani equalsIgnoreCase icin ali, ALI, ALi, AlI, aLI, alI birbirine esittir
         ama kelimede farklilik varsa bunlari tolere etmez
         a li  ile ali birbirine esit degildir
         ali ile ALI. birbirine esit degildir
         */

        System.out.println(str1.equals(str2)); // sadece equals dediğimizde false dedi
                                               //buyuk-kucuk harf duyarliligi gozetti fakat ;
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str4));

        System.out.println(str1.equalsIgnoreCase(str2));//IgnoreCase i de secince buyuk-kucuk harf bakmadi TRUE dedi










    }
}
