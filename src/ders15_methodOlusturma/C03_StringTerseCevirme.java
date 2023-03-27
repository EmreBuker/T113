package ders15_methodOlusturma;

public class C03_StringTerseCevirme {

    // parametre olarak bir String kabul edip
    // String'in terse cevrilmis halini döndüren bir method olusturun

    public static void main(String[] args) {

        String input="Java kod yazdikca guzellesir";

        System.out.println(StringTerseCevir(input));


    }

    public static String StringTerseCevir(String input){

        String tersStr="";
        for (int i = input.length()-1; i >=0 ; i--) { // terse gittigi icin eksi eksi yaptik
                                                      // 0.karaktere varana kadar dedigi icinde i>=0 yaptik
            tersStr=tersStr+input.charAt(i);

        }

        return tersStr; // bu islemden sonra main methoda gecip kodumuzu cagiricaz ..
    }

}
