package ders16_overloading_whileLoop;

public class C09_AsalSayiYazdir {

    //Verilen pozitif bir tamsayinin
    // asal sayi olup olmadigini yazdiran bir method olusturun

    public static void main(String[] args) {


        asalMiYazdir(20);
        asalMiYazdir(35);
        asalMiYazdir(23);

    }

    public static void asalMiYazdir(int sayi){

        int flag=0;// (String "asal" da yapabilirdik !

        for (int i = 2; i <sayi ; i++) {

            if (sayi%i==0){
                flag++;
                break;

            }
        }
        if (flag==0){
            System.out.println("Girilen "+ sayi + " sayisi Asal bir sayidir");
        }else {
            System.out.println("Girilen "+ sayi + " sayisi Asal bir sayi degildir");
        }
    }
}
