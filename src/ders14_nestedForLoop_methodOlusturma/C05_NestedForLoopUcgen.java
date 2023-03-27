package ders14_nestedForLoop_methodOlusturma;

public class C05_NestedForLoopUcgen {
    public static void main(String[] args) {

        /*
         nested for loop kullanarak asagidaki sekli hazirlayin
         1
         1 2
         1 2 3
         1 2 3 4
         1 2 3 4 5
         */

        for (int i = 1; i <=5 ; i++) { // dis loop

            for (int j = 1; j <= i; j++) { // i'ye kadar
                System.out.print(j +" ");
            }
            System.out.println("");

            /*
            dikdortgen olursa satir-sutun,ucgen oldugunda ise satir-i'ye kadar
             */
        }
    }
}
