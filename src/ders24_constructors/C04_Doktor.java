package ders24_constructors;

public class C04_Doktor {

    C04_Doktor(){// bunu yaptiktan sonra artık bu class'da default constructor yok

    }

    String isim="Isim atanmamis";
    String soyisim="Soyisim atanmamis";
    String telNo;
    String adres;
    int yas;
    boolean izindeMi;
    char evliMi;
    int ekMesaiUcreti=30;

    public int mesaiUcretiHesapla(int mesaiSaati) {
        return mesaiSaati * ekMesaiUcreti;
    }
}
