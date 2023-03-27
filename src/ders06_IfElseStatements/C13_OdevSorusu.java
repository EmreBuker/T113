package ders06_IfElseStatements;

public class C13_OdevSorusu {
    public static void main(String[] args) {
        //Soru : kullanicidan aldigi urun adedi ve liste fiyatini alin
        //kullaniciya musteri karti olup olmadigini sorun
        //Musteri karti varsa 10 urunden fazla alirsa yuzde 20 yoksa yuzde 15 indirim yapin
        //musteri karti yoksa 10 urunden fazla alirsa yuzde 15 yoksa yuzde 10 indirim yapin

        int urunAdedi =30;
        boolean kartVarmi = false;
        double listeFiyati =12.5;
        double toplamFiyat = 0; // müşterinin ödeyeceği bedel

        if (kartVarmi && urunAdedi>=10){
            toplamFiyat=urunAdedi*listeFiyati* (0.8); // fiyat hesaplaması için urun aded ve liste fiyatiyla
                                                      //yapilan indirim tutarini carptik
            System.out.println("Yuzde 20 indirimli toplam fiyati : " + toplamFiyat);
        } else if (kartVarmi && urunAdedi<10) {
            toplamFiyat=urunAdedi*listeFiyati* (0.85);
            System.out.println("Yuzde 15 indirimli toplam fiyati : " + toplamFiyat);

        } else if (!kartVarmi && urunAdedi>=10) { // kartvarmi'nin basina ünlem koyduk ki diger beyanlardan fark olsun
                                                  // hata vermesin.Aksi takdirde gecersiz uyarisi vermektedir. ÖNEMLİ
            toplamFiyat=urunAdedi*listeFiyati*(0.85);
            System.out.println("Yuzde 15 indirimli toplam fiyati : " + toplamFiyat);
            
        } else if (!kartVarmi && urunAdedi<10) {
            toplamFiyat=urunAdedi*listeFiyati*(0.90);
            System.out.println("Yuzde 10 indirimli toplam fiyati : " + toplamFiyat);
        }else{
            System.out.println("Gecersiz Giris");
        }
    }
}
