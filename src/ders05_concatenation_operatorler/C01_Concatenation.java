package ders05_concatenation_operatorler;

public class C01_Concatenation {
    public static void main(String[] args) {

        //sadece asagida verilen variable'lari kullanarak istenen degerleri yazdiralim

        String s1="Java" ;
        String s2="Guzeldir";
        String s3="";
        String s4=" ";

        int sayi1=4;
        int sayi2=3;
        // Java Guzeldir7 yazdirin
        System.out.println(s1+s4+s2+(sayi1+sayi2));


        // Java Guzeldir 12 yazdirin
        System.out.println(s1+s4+s2+s4+sayi1*sayi2); // carpma islemi oldugu icin Parantez icine almasakta olurdu

        //7Java Guzeldir yazdirin
        System.out.println(sayi1+sayi2+s1+s4+s2); //Paranteze almadik cunku Java sagdan sola geldigi icin
                                                  // once islemi sonra stringi aldi.Yani once string ifade olsaydi
                                                 //paranteze almamiz gerekirdi

        //34 Java yazdirin
        System.out.println(s3+sayi2+sayi1+s4+s1);// Onemli ornektir string hale gelmesi icin
                                                   // basina sadece "" hiclik ifadesi ekledik

        //Java7 Guzeldir43 yazdirin

        System.out.println(s1+(sayi1+sayi2)+s4+s2+sayi1+sayi2);















    }
}
