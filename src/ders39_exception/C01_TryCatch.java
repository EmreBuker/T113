package ders39_exception;

public class C01_TryCatch {
    public static void main(String[] args) {

        int sayi1=20;
        int sayi2=0;

        try {
            System.out.println(sayi1/sayi2);
        } catch (ArithmeticException e) {
           // e.printStackTrace();  exception'da gordugumuz tum hata aciklamalarini yazdirir
            // System.out.println(e.getMessage()); by zero -- hatanin kaynagini gosterdi
        }

        /*
              bir try catch blog 3 bolumden olusur

            1- exception olusturma potansiyeli olan kodlar
            2- catch (ArithmeticException e)
               catch statement :
               ArithmeticException : olusma ihtimali olan exception
               e : karsilastigi sorunu kaydedecegi variable oluyor
            3- catch blogu : ongorulen exception gerceklestiginde calismasini
                             istedigimiz kodlar
         */
    }
}
