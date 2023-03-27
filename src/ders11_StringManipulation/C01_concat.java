package ders11_StringManipulation;

public class C01_concat {
    public static void main(String[] args) {

        String str1="Java";
        String str2="Guzeldir";
        boolean bl=true;
        int sayi=20;
        double dbl=3.54;

        System.out.println(str1+bl+sayi);//Javatrue 20, basinda string oldugu icin hepsini stringlestirdi

        // concat methodu sadece String variable'lari birlestirmek icin kullanilir

        System.out.println(str1.concat(" ").concat(str2));// yani concatenation ' i daha once gordugumuzde
                                                              // + kullanmistik.Bi farki yok.Hatta +'yi herseyle
                                                              // kullanirdik bunu sadece Stringler'le







    }
}
