package ders08_TernaryOperator;

import java.util.Scanner;

public class C04_TernaryOrnek {
    public static void main(String[] args) {
        //kullanicidan bir tam sayi alin
        // sayi cift ise "sayi cift"
        //degilse "tek sayi" yazdirin ..

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir tam sayi giriniz");
        int sayi= scan.nextInt();


        System.out.println(sayi%2==0 ? "cift sayi" : "tek sayi");
    }
}
