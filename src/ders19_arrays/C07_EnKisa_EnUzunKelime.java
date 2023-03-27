package ders19_arrays;

public class C07_EnKisa_EnUzunKelime {
    public static void main(String[] args) {

        // Soru 6- Verilen String bir array’deki
        // en uzun ve en kisa kelimeleri yazdiran bir method olusturun.

        String[] arr ={"Hasan", "Ilker","Senturk","Omer Faruk"};

        enUzunEnKisaIsimleriYazdir(arr);

    }

    public static void enUzunEnKisaIsimleriYazdir(String[]arr){

        String enUzunkelime=arr[0];
        String enKisakelime=arr[0]; // burada ki mantık su. Sıfırıncı indexi sectik ki kıyaslıycağımız
                                    // bi kriter olusturmak icin

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length()>=enUzunkelime.length()){

                enUzunkelime=arr[i];

            }
            if (arr[i].length()<=enKisakelime.length()){
                enKisakelime=arr[i];
            }
        }

        System.out.println("En uzun isim : " + enUzunkelime);
        System.out.println("En kisa isim : " + enKisakelime);

    }
}
