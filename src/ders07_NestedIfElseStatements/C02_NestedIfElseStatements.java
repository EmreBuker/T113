package ders07_NestedIfElseStatements;

import java.util.Scanner;

public class C02_NestedIfElseStatements {
    public static void main(String[] args) {
        //SORU ; kullanicidan cinsiyetini ve yasini alin,Kadin 60 yas ve uzeri,
        //Erkek 65 yas ve uzeri emekli olabilir.Cinsiyet ve yasini dikkate alarak
        //"Emekli olabilirsin" veya "Emekli olmak icin ... yil daha calisman gerekir"   yazdirin
        /*
        01'deki soruyla ayni,farkli cozum uygulamasi yapilacaktir ..
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz");
        String cinsiyet= scan.nextLine();
        System.out.println("Lutfen yasinizi giriniz");
        int yas= scan.nextInt();                    // Cok onemli bir detay. Scanner olarak yazdigimizda once yasi
                                             // istedigimizde sistemden kod calisiyo fakat asil sonucu alamıyoruz
                                             //degerleri onceden verdigimizde sorun yok fakat scanner
                                            // olarak verildiginde mutlaka dikkat etmeliyiz

        if (cinsiyet.equalsIgnoreCase("erkek")) {
            if (yas < 15){
                System.out.println("gecersiz yas");
            } else if (yas < 65) {
                System.out.println("emekli olmak icin daha " + (65 - yas) + "yil daha calismalisin");

            }else System.out.println("emekli olabilirsin");
        } else if (cinsiyet.equalsIgnoreCase("kadin")){
            if(yas < 15){
                System.out.println("gecersiz yas");
            } else if (yas < 60) {
                System.out.println("emekli olmak icin " + (60 - yas) + "yil daha calismalisin");

            }else System.out.println("emekli olabilirsin");
        }
    }
}


