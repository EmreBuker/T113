package ders03_datacastingWrapperClass;

public class C01_DataCasting {
    public static void main(String[] args) {

        /*
        bazi data turleri asla birbirine cast edilemez.Fakat altta olan bazi ornekler otomatik cevrilebilir

         */
        double s = 20; // 20 normalde int fakat double olarakta kabul etti cunku her tam sayi,
        int sayi =15; //aslinda bir ondalikli sayidir ayrica double daha genis
        long ln=sayi; // esitligin sol tarafi long,sag tarafi yani deger int fakat Java itiraz etmedi

        //Daha küçük kapsamli data turundeki bi degeri daha genis kapsamli data turundeki veriable'a
        //atama yapmak istedigimizde Java bunu otomatik yapacaktir
        // KISACASI KUCUK DEGER BUYUK DEGERE HER HALUKARDA ATANIR. Ornekler asagidadir ;

        short sh=23;
        int a=sh;
        long lng=sh;
        float fl=lng;

        //Tam tersi olursa Java bunu OTOMATIK OLARAK kabul Etmez !






    }
}
