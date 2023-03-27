package ders06_IfElseStatements;



public class C06_IfElseStatements {
    public static void main(String[] args) {
        /*
        If Else Statementsda suslu parantez kullanmazsak { } hem if bodys'si hemde
        else body'si icin sadece 1 satir kabul eder
        sonraki satirlar if else ile iliskilendirilmez,bu sefer her durumda calisir
         */

        int not = 56;

        if (not >= 50)
        {

            System.out.println("Sinifi Gectin");
            System.out.println("Yazin Kafan Rahat");
        }else{
            System.out.println("Bu Dersten Kaldin");
            System.out.println("Yaz Okulana Bekleriz :) ");
        }
    }
}
