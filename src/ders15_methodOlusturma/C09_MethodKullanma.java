package ders15_methodOlusturma;

import java.util.Scanner;

public class C09_MethodKullanma {
    public static void main(String[] args) {
        // verilen bir String'in Palindrome olup olmadigini yazdirin
        // palindrome : duzden ve tersten aynı sekilde yazilan
        // madam,12321,kabak

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir metin giriniz");

        String metin=scan.nextLine();

        String tersMetin = C03_StringTerseCevirme.StringTerseCevir(metin);
        if (metin.equals(tersMetin)){
            System.out.println("Girilen metin PALINDROME");
        } else{
            System.out.println("Girilen metin PALINDROME degil");
        }


    }

}
