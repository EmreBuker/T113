package ders10_StringManipulations;

public class C04_charAt {
    public static void main(String[] args) {

        String kelime="eren";
        System.out.println(kelime.charAt(3));// 0 ilk harfe tekabul eder
        /*
        Bu method sadece getirmeye yariyo.Degistirme yapmiyor
         */

        String str="Java Candir";
        System.out.println(str.charAt(1));//a
        System.out.println(str.charAt(4));//bosluk // boslukta bir karakterdir

        /*
          bir metindeki karakter sayisi ile son index arasinda 1 fark vardir
          bu metin icin  karakter sayisi 11
                         son index 10 dur.
         */


    }
}
