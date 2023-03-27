package ders24_constructors;

public class C03_HemsireRunner {
    public static void main(String[] args) {

        //default constructor GORUNMEZ,
        //parametresi yoktur,cons body'si bostur

        // ismi class ismi ile aynı,return type yok,body si bos -- C02_Hemsire () {

        C02_Hemsire hemsire1=new C02_Hemsire();// parametresiz constructor

        System.out.println(hemsire1.isim);// Isim atanmamis
        System.out.println(hemsire1.evliMi);// hiclik
        System.out.println(hemsire1.yas);// 0
        System.out.println(hemsire1.izindeMi);// false

        hemsire1.isim="Tuba";
        hemsire1.yas=29;
        System.out.println(hemsire1.isim);// Tuba
        System.out.println(hemsire1.yas);// 29


    }
}
