package ders15_methodOlusturma;

public class C02_StringConcate {

    // verilen iki String'i parametre olarak kabul edip
    // bu iki String'i aralarinda bir bosluk olan tek bir String olarak
    // main method'a donduren bir method olusturun

    public static void main(String[] args) {

        String str1="Java";
        String str2="Guzeldir";

        System.out.println(Birlestirme(str1, str2));
        System.out.println(Birlestirme("Bu da", "olur"));

    }

    public static String Birlestirme(String str1,String str2){
        return str1+" "+str2;

    }
}
