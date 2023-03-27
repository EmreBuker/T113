package ders16_overloading_whileLoop;

import java.util.Scanner;

public class C03_WhileLoop {
    public static void main(String[] args) {

        // 2 basamakli sayilari aralarinda bir bosluk olacak sekilde
        // yanyana yazdirin

        for (int i = 10; i <=99 ; i++) {
            System.out.print(i+" ");

        }

        System.out.println(""); // alt satira gecmesi icin yaptik onemli birsey degil

        //while loop ile yapalim ..

        int s=10;

        while (s<=99){
            System.out.print(s+" ");
            s++;
        }

        // 50 ve 100 arasındaki sayiları sinirlar dahil,sayilari toplayin
        // for loop'da 3 seyi takip ederdik
        // 1- baslangic degeri,2-bitis sarti,3-artis veya azalis sekli

        int toplam=0;
        int sayi=50;
        while (sayi<=100){  // fakat bu tür sorular icin for loop kesinlikle daha mantıklı
            toplam+=sayi;
            sayi++;
        }

        System.out.println("while ile toplam : "+ toplam);
    }
}
