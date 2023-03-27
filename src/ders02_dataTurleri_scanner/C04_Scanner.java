package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {

// kullanicidan ismini alip buyuk harflerle yazdirin

       // 1.adim : scan objesi oluşturma
        Scanner scan = new Scanner(System.in);

        //2.adim : kullaniciya ne istedigimizi yazdiralim
        System.out.println("Lutfen adinizi giriniz");


        //3.adim : kullanicidan istedigimiz bilginin turune gore variable olusturup,scanner methotlarindan uygun olanini
        //kullanarak alinan degeri variable'a atayalim
        String kullaniciAdi=scan.next();

        System.out.println(kullaniciAdi.toUpperCase());
        



    }
}
