package ders26_staticKeyword;

public class C03_StaticBlocks {

    static {
        System.out.println("1.statik blok calisti"); // static daha önce calisir
    }

    public static void main(String[] args) {
        System.out.println("main method calisti");
    }

    static {
        System.out.println("2.static block calisti");
    }
}
