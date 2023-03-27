package ders24_constructors;

public class C02_Hemsire {

        /*
        Ornegin bir hastane programinda,hastanede calisacak hemsirelerin hangi bilgilerini
        tutmak istiyorsak hangi methodlari hemsireler icin kullanmak istiyorsak
        bir hemsire class'ı olusturup tum bu ozellikleri(variable ve methodlari)
        o class'da olustururuz
        */

    // bizde istedigimiz parametlere sahip
    // istedigimiz kadar constructor olusturabiliriz

    // COK ONEMLI; Eger biz bir constructor olusturursak
    // yani class'da gozle gorunen bir constructor varsa
    // Java default constructor'i siler

    String isim="Isim atanmamis";
    String soyisim="Soyisim atanmamis";
    String telNo;
    String adres;
    int yas;
    boolean izindeMi;
    char evliMi;
    int ekMesaiUcreti=20;

    public int mesaiUcretiHesapla(int mesaiSaati){
        return mesaiSaati*ekMesaiUcreti;





    }
}
