package ders06_IfElseStatements;

import java.util.Scanner;

public class C07_IfElseStatements {
    public static void main(String[] args) {
        //Kullanicidan bir harf alin
        //girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin
        //yoksa girilen harfi yazdirin

        Scanner scan=new Scanner(System.in);

        System.out.println("Bir harf giriniz");
        char krk=scan.next().charAt(0);

        if ( krk >='a' && krk<='z'){
            System.out.println((char) (krk-32)); // sadece krk-32 yazdigimizda sayisal bi sonuc verdi
                                                 //Harf vermesi icin paranteze alip basina char ifadeyi ekledik
                                                 //Character.touppercaseyapabilirdik
        }else{
            System.out.println(krk);
        }
    }
}
