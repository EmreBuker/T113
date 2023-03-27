package ders11_StringManipulation;

public class C10_isEmpty {
    public static void main(String[] args) {

        String str=""; // bu method bos mu diye soruyor.Boolean olarak donuyor
        System.out.println(str.isEmpty());

        str="    ";

        System.out.println(str.isEmpty());//bos degil icinde karakter var,false
        System.out.println(str.isBlank());//true,bosluk var

        str="x";

        System.out.println(str.isEmpty());//false
        System.out.println(str.isBlank());//false // ne bos ne de  bosluk oldugu icin ikiside false
    }
}
