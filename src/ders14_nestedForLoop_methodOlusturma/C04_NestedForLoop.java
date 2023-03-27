package ders14_nestedForLoop_methodOlusturma;

public class C04_NestedForLoop {
    public static void main(String[] args) {

         /*
        Asagidaki sekli yazdiran bir kod hazirlayin
        * * * * * *
        * * * * * *
        * * * * * *
        * * * * * *
         */

        for (int i = 1; i <=4 ; i++) { // disardaki loop 1den 4 e kadar - satir sayisi

            for (int j = 1; j <=6 ; j++) { // icerdeki loop ise 1den 6ya kadar olmali,6 karakter mevcut - sutun sayisi
                System.out.print("* ");
            }
            System.out.println(""); // loop bitince alt satira gecmesi icin
        }
    }
}
