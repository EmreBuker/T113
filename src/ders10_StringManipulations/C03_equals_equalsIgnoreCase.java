package ders10_StringManipulations;

public class C03_equals_equalsIgnoreCase {
    public static void main(String[] args) {

        String s1="Java";
        String s2="java";

        String s3=new String ("Java"); // if-else ve ternary olarak bir daha cozduk
        String s4=new String("Java");

        if(s1==s3){
            System.out.println("Esleme dogrulandi");
        }else System.out.println("Esleme dogrulanmadi"); // doğrulanmadi dedi == kullanmadan bakalim

        if(s1.equalsIgnoreCase(s3)){
            System.out.println("Esleme dogrulandi");
        }else System.out.println("Esleme dogrulanmadi");// dogrulandi dedi ..

        System.out.println(s1.equalsIgnoreCase(s4)?"Esleme dogrulandi":"Esleme dogrulanmadi");


    }
}
