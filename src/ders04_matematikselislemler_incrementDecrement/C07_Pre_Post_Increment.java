package ders04_matematikselislemler_incrementDecrement;

public class C07_Pre_Post_Increment {

    public static void main(String[] args) {

        int a =10;// 11
        int b=a++;// once islem sonra arttirma mantigi  11
        int c=++b;// once arttir sonra islem mantigi  11

        System.out.println("a : " +a+ ",b : "+b+",c : "+c);

        a=20; //22
        b=++a;//21
        c=a++;//21

        System.out.println("a : "+a+",b : "+b+",c : "+c);














    }
}
