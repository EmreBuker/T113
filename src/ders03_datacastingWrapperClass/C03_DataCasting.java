package ders03_datacastingWrapperClass;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {
        //Kullanicidan bir tam sayi alin
        //Kullanici kac girerse girsin konsolda
        //-128 ile + 127 arasında yazılacak bir kod olsun

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir tam sayi giriniz");
        int sayi= scan.nextInt();

        byte donusenSayi=(byte)sayi;

        System.out.println(+sayi+"nin donusmus hali " + donusenSayi );







    }
}
