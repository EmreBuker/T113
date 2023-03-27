package ders10_StringManipulations;

public class C05_length {
    public static void main(String[] args) {

        String str = "Uzunkavaklaraltindayataruyumazoglu";

        System.out.println(str.length());//34 -String bi degerin kac karakterde olustugunu bulabiliriz,Uzunluk

        //son karakteri yazdiralim

        System.out.println(str.charAt(33));//bir metindeki karakter sayisi ile son index arasinda 1 fark vardir;
                                           //bilgisinden yola cikarak bir dusugu olur
        System.out.println(str.charAt(str.length()-1));//u

        //sondan 6.karakteri yazdirin

        System.out.println(str.charAt(str.length()-6));//a








    }
}
