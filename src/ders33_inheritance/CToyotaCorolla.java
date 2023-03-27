package ders33_inheritance;

public class CToyotaCorolla extends BToyota {

    String lastik="Lassa 205-55-15";
    String model="Corolla";
    String yakit="Corolla,dizel,benzinline ve elektrikli olabilir";

    public void motor(){
        System.out.println("Corolla araclar turkiye'de uretilen motor kullanir");
    }


    public void uretimYeri(){
        System.out.println("Corolla araclar Turkiye'de uretilir");
    }

    public static void main(String[] args) {

        CToyotaCorolla corolla=new CToyotaCorolla();
        System.out.println(corolla.lastik); // corolla classı kullanılır guncel oldugu icin
        System.out.println(corolla.model); // corolla classı, once kendi bulundugu class'a bakiyor
        System.out.println(corolla.yakit); // corolla classı
        corolla.motor(); // corolla classı
        corolla.uretimYeri(); // corolla classı

        System.out.println(corolla.marka); // Btoyota classı parent
        System.out.println(corolla.aku); // Btoyota Parent
        corolla.guvenlik(); //  Btoyota

        System.out.println(corolla.vites); // grandparent Araca classı


    }
}
