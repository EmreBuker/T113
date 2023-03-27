package ders03_datacastingWrapperClass;

import java.util.Scanner;

public class C04_CharDataCasting {
    public static void main(String[] args) {
        System.out.println('a'+'b');

        //kullanicidan char bi karakter alin
        //o karakterden sonra gelen uc karakteri yazdirin
        //ornek input : a, output:bcd

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir karakter giriniz");
        char Krk=scan.next().charAt(0);

        System.out.println("" + (char)(Krk+1)+(char)(Krk+2)+(char)(Krk+3));



    }
}
