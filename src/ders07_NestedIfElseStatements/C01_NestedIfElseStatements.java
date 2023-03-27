package ders07_NestedIfElseStatements;

public class C01_NestedIfElseStatements {
    public static void main(String[] args) {
        //SORU ; kullanicidan cinsiyetini ve yasini alin,Kadin 60 yas ve uzeri,
        //Erkek 65 yas ve uzeri emekli olabilir.Cinsiyet ve yasini dikkate alarak
        //"Emekli olabilirsin" veya "Emekli olmak icin ... yil daha calisman gerekir"   yazdirin
        /*
        6.ders c10 sorusu ile ayni,farkli sekilde cozucez
         */
        char cinsiyet='K';
        int yas=56;
        //nested seklinde kullanim icin once Ana degiskeni secmemiz gerekmekte
        //bu soruda cinsiyet ana degiskenimiz olsun

        if(cinsiyet=='K' || cinsiyet=='k') {
            if (yas < 15) {
                System.out.println("gecersiz yas");
            } else if (yas < 60) {
                System.out.println("emekli olmak icin " + (60 - yas) + "yil daha calismalisin");

            } else System.out.println("emekli olabilirsin");
        } else if (cinsiyet=='E' || cinsiyet=='e') {
            if (yas < 15) {
                System.out.println("gecersiz yas");
            } else if (yas < 65) {
                System.out.println("emekli olmak icin " + (65 - yas) + "yil daha calismalisin");

            } else System.out.println("emekli olabilirsin");
        } // Bazı notlar ; yas>65 i yapmadik cunku digerlerini yazmamiz ona gerek birakmadi
          //aslinda if else belki daha kısa kod fakat bu daha anlasilir
          //belirledigimiz tek cinsiyet degiskeni altinda,alt basliklar gibi siralamis olduk
    }
}
