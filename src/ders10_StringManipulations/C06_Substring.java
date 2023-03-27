package ders10_StringManipulations;

public class C06_Substring {
    public static void main(String[] args) {

        String str="Java öğren, isi kap";

        System.out.println(str.substring(5));//Cumledeki 5.degerden sonrasini aldi,öğren, isi kap
        System.out.println(str.substring(0));//Java öğren, isi kap

        System.out.println(str.length());//19
        // son karakteri String olarak kaydedin

        String sonHarf= ""+str.charAt(str.length()-1);
        sonHarf=str.substring(str.length()-1);
        System.out.println(sonHarf);//p

        System.out.println(str.substring(18));//kendim turettim.Toplam uzunluktan bi karakter
                                                       // eksilttim
        // son indexdeki karakteri upper case olarak yazdirin

        System.out.println(str.substring(str.length()-1).toUpperCase());

        // son 3 harfi buyuk harf olarak yazdirin

        System.out.println(str.substring(str.length()-3).toUpperCase());

        //Kendime baska bi ornek ;

        String imput="35Emre Buker53";// son 2 harfi String olarak kaydedin

        System.out.println(imput.length());//14

        System.out.println(imput.substring(imput.length()-2));

        String sonKrk=""+imput.charAt(imput.length()-1);






    }
}
