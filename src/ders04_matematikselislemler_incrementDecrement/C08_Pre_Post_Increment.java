package ders04_matematikselislemler_incrementDecrement;

public class C08_Pre_Post_Increment {
    public static void main(String[] args) {

        int x=3;// 4

        int y = 2 * ++x;// y=8 // y=7 // once islem sonra arttırma veya eksiltme unutma ..
        int z=5+y--;//z=13

        System.out.println(x+y+z);

    }
}
