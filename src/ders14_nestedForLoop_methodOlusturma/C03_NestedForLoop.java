package ders14_nestedForLoop_methodOlusturma;

import java.util.Arrays;

public class C03_NestedForLoop {
    public static void main(String[] args) {

        // 1-4 arasindaki sayilar icin carpim tablosu olusturalim
        

        // alttaki dis dongu satirlari kontrol eder
        for (int i = 1; i <=4 ; i++) {

            //alttaki ic dongu her satirda olan degerleri kontrol eder
            for (int j = 1; j <=4 ; j++) {
                System.out.print(i*j + " ");
                
            }
            // ic dongu bittiginde de javayi alt satira indirmek icin ;
            System.out.println("");

        }
    }
}
