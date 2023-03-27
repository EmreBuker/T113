package ders007_genelTekrar_IfElse;

public class C01_DataCasting {
    public static void main(String[] args) {

        //Java'da bazi data turleri asla baska data turlerine cevrilemez

        /*
        String deger boolean'a,boolean degeri char'a ceviremeyiz

        Fakat sayisal data turundeki degerler baska sayisal data turlerine atanabilir
        Otomatik yada kendimiz yapabiliriz

         */

        short sayi2='k';
        if (sayi2>'d'){ // char data turundeki degerler,sayisal islemlerde kullanilabiliyor.Onemli !
                        //Genellikle ASCII table'daki degeri ilseme girer

            System.out.println('k'+1);
            //eger bu islemin char olarak degerini yazdirmak istersek

            System.out.println((char) ('k'+1));


        }






    }
}
