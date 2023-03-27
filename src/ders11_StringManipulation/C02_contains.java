package ders11_StringManipulation;

public class C02_contains {
    public static void main(String[] args) {

        String str="Java ile kodlama cok zevkli";

        System.out.println(str.contains("cok")); //true-false

        System.out.println(str.contains("odla"));// manasiz bi kelime olsa da içinde gecmesi yeterli

        System.out.println(str.contains("a")); // sadece var yada yok

        // parametre olarak char kabul etmek 's' gibi.. Olmaz

        //CharSequence : char dizisi-karakter dizisi

        System.out.println(str.contains("java")); // Java vardi cümlede fakat o buyuk harf,bu kucuk harf

        String str2="Java";
        System.out.println(str.contains(str2)); // true str str2'yi icerdigi icin true

    }
}
