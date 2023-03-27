package ders34_inheritance;

public class DCorolla extends CToyota {

    String str3="Corolla";

    DCorolla(){
        System.out.println("Parametresiz Corolla constructor calisti");
    }
    DCorolla(int sayi){
        super(8);
        System.out.println("int parametreli Corolla Constructor calisti");
    }

    public static void main(String[] args) {

        DCorolla obj1=new DCorolla(5);
    }
}

/*
    Biz gorunur bir cons olusturdugumuzda
    Java'nin default cons'i silmesine benzer olarak

    Extends keyword kullanilmis bir class'daki
    herhangi bir cons'in ilk satirinda
    gozle gorunur bir cons call yazilmissa
    java default olarak koydugu super() ' u siler

    Bir constructor icinde sadece 1 tane
    cons call olabilir
    o da ilk satirda olmak zorundadir

    Eger this veya super parametler cons call yaptigimizda yazdigimiz
    argument ile uyumulu prametreye sahip bir cons yoksa Java CTE verir
 */

