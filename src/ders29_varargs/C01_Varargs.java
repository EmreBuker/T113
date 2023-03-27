package ders29_varargs;

import java.util.Arrays;

public class C01_Varargs {
    public static void main(String[] args) {

        topla(3,4);
        topla(3,4,6,7,8); // birden fazla element kabul edebiliyor

        // varargs bir array'dir

    }

    public static void topla(int...a){
        System.out.println(Arrays.toString(a));

        int toplam=0;

        for (int each:a
             ) {
            toplam+=each;
        }

        System.out.println(toplam);

    }

    /*
    Java'da bir method parametlerine uygun argumente sahip
    method call oldugunda calisir

    Ornegin 2 int parametre varsa
    sadece 2 int argument ile method call yapildiginda calisir

    Java aynı data turune sahip olmak sartiyla
    parametre sayisini esnek tutabilmek icin varargs olusturmustur
     */

}
