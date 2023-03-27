package ders04_matematikselislemler_incrementDecrement;

public class C06_Pre_Post_Increment {
    public static void main(String[] args) {
         int a =10; // a veriable nin degerini yazdirip,sonra a'nin degerini bir arttirin

        System.out.println(a);

        a++;
        // a variable'nin degerini bir arttirip,sonra yazdirin

        a++;
        System.out.println(a);

        int c=10; // c veriable nin degerini yazdirip,sonra degerini bir arttirin
        System.out.println("c:" + c++);

        int d=10; // d variable'nin degerini bir arttirip,sonra yazdirin

        System.out.println("d:"+ ++d); // ONEMLİ : c++ ' a post increment denir ; o satir icin islemi yazdirir
        // sonra arttirir ,, ++d ' pre increment denir ; once arttirir sonra islemi yazdirir



    }
}
