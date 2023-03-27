package ders12_StringManipulation;

public class C09_Soru {
    public static void main(String[] args) {

        /*
        Soru 2 : Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.

        input1 : “15.30 €” , input2 : “11.40 €”
        output : 26.70 €
         */

        String input1="15.30 €";
        String input2="11.40 €";

        //input'larda digit olmayan herseyi yokedelim

        input1=input1.replaceAll("\\D","");// 1530
        input2=input2.replaceAll("\\D","");// 1140
        //digit olmayanlari yok ettik fakat int'a cevirmeliyiz

        double inp1=Double.parseDouble(input1);
        double inp2=Double.parseDouble(input2);

        System.out.println((inp1 + inp2)/100+" €");


    }
}
