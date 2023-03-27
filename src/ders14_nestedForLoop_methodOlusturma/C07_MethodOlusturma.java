package ders14_nestedForLoop_methodOlusturma;

public class C07_MethodOlusturma {
    public static void main(String[] args) {

        String str="Java muhtesemdir";

        //metni buyuk harfe cevirin

       // str.toUpperCase(); bu sekilde yaptıgımızda sadece tanımladık atamadık
                            // o yuzden buyuk harf yazdirmadi

        str=str.toUpperCase();
        System.out.println(str);

        // metnin buyuk harflere cevrilmis hali S iceriyor mu ?

        System.out.println(str.contains("S")); // true

    }
}
