package ders06_IfElseStatements;

public class C10_IfElseIfStatements {
    public static void main(String[] args) {
        //SORU ; kullanicidan cinsiyetini ve yasini alin,Kadin 60 yas ve uzeri,
        //Erkek 65 yas ve uzeri emekli olabilir.Cinsiyet ve yasini dikkate alarak
        //"Emekli olabilirsin" veya "Emekli olmak icin ... yil daha calisman gerekir"   yazdirin

        char cinsiyet='E';
        int yas=60;

        if (cinsiyet=='E' && yas>=65){
            System.out.println("Emekli olabilirsin");
        } else if (cinsiyet=='E'&& yas<65) {
            System.out.println("Emekli olmak icin " + (65-yas) + " yil daha calismalisin");
        } else if (cinsiyet=='K' && yas>=60) {
            System.out.println("Emekli olabilirsin");
        } else if (cinsiyet=='K' && yas<60) {
            System.out.println("Emekli olmak icin " + (60-yas) + " yil daha calismalisin");
        }else{
            System.out.println("gecersiz giris");
        }
    }
}
