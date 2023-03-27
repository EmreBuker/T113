package ders06_IfElseStatements;

import java.util.Scanner;

public class C12_OdevSorusu {
    public static void main(String[] args) {
        //Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini hesaplayin(kilo*10000/(boy*boy))
        //vucut kitle endeksi 30'dan buyukse obez,25-30 arasi ise kilolu,20-25 arasi ise normal
        //20'den kucukse zayif  ..  YAZDIRIN

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen kilonuzu girin");
        double kg= scan.nextDouble();
        System.out.println("lutfen boyunuzu girin");
        double cm= scan.nextDouble();

        double vke=kg*10000/(cm*cm);

        System.out.println("Vucut kitle endeksiniz : " + vke);


        // vke:vucut kitle endeksi
        if (vke>30){
            System.out.println("obez");
        } else if (vke>25)
        {
            System.out.println("kilolu");

        } else if (vke>20) {
            System.out.println("normal");

        }else if (vke>0){
            System.out.println("zayif");
        }
    }
}
