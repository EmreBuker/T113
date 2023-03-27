package ders05_concatenation_operatorler;

import java.util.Scanner;

public class C03_IfStatements {
    public static void main(String[] args) {

        //kullanicidan iki tam sayi alin,eger birinci sayi 100'den büyükse "ilk sayi
        // 100'den büyük" yazdirin.Eger ikinci sayi cift ise, "ikinci sayi
        //cift" yazdirin.Eger ilk sayi ikinci sayidan buyukse "ilk sayi
        //daha buyuk" yazdirin

        int say1=164;
        int say2=146;

        if(say1>100){
            System.out.println("İlk sayi 100'den buyuk");
        }if (say2%2==0){
            System.out.println("ikinci sayi cift");
        }if (say1>say2){
            System.out.println("ilk sayi daha buyuk");
        }



    }
}
