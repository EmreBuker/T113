package ders12_StringManipulation;

public class C01_nullPointer {
    public static void main(String[] args) {

        String str1=""; // str1'e deger atanmistir.Bunun bi degeri var
        System.out.println(str1.concat("Java")); // Javayla birlestirmis gibi olduk o yuzden concat oldu

        String str2;//str2'e deger atanmadi

         // System.out.println(str2.concat("Java")); deger atanmadigi icin method'la kullanilamaz

        str2="Java candir"; // deger atandiktan sonra hersey yapilabilir

        String str3=null; // str3'e deger atanmamistir
                          // null pointer ile javaya deger atamadigimizi biliyoruz diyoruz

        System.out.println(str3);

        System.out.println(str3.concat("Java")); // NullPointerException hatasi verir

        /*
        null'in asil amaci kodumuzu calisir vaziyette tutmak .En yukardaki ornekte goruldugi gibi
        hiç deger atamadigimizde calistiramıyoruz
         */

    }
}
