package ders16_overloading_whileLoop;

public class C10_isAsal {
    public static void main(String[] args) {

        // Verilen 1'den buyuk bir tamsayi icin
        // sayi asal ise true
        // sayi asal degil ise false dönen bir method olusturun

        System.out.println(isAsal(20));
        System.out.println(isAsal(43));

        // ya da boolean sonuc=isAsal(sayi:43); yapabilirdik,farketmez

    }

    public static boolean isAsal(int sayi){

        int flag=0;// (String "asal" da yapabilirdik !

        for (int i = 2; i <sayi ; i++) {

            if (sayi%i==0){
                flag++;
                break;

            }
        }
        if (flag==0){
            return true;
        }else {
            return false;
        }
    }
}
