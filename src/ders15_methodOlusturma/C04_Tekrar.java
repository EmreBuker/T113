package ders15_methodOlusturma;

public class C04_Tekrar {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        // bu iki sayinin carpim sonucunu yeni kod yazmadan konsola yazdirin

        System.out.println(C01_Carpim.carpim(a, b));

        String c="Nasil";
        String d="yani?";
        // Bu iki String'i aralarinda bir bosluk birakarak yazdirin

        System.out.println(C02_StringConcate.Birlestirme(c, d));

        String e= "Bu da mi oldu?";
        // e String'ini tersten yazdirin

        System.out.println(C03_StringTerseCevirme.StringTerseCevir(e));

        // "Bu cumleyi terse cevirin"

        System.out.println(C03_StringTerseCevirme.StringTerseCevir("Bu cumleyi terse cevirin"));

                // Yukaridaki ornekte goruldugu uzere olusturdugumuz kod'da variable sartı yok

        String str="Java cok guzel";

        System.out.println(str.toUpperCase());

        System.out.println(str); // kalıcı olarak kaydetmedi,CUNKU ATAMA YAPMADIK

        str=str.toUpperCase();
        System.out.println(str);


    }
}
