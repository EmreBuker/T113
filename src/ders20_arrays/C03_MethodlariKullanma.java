package ders20_arrays;

import ders19_arrays.C03_ArrayElementleriniArtirma;
import ders19_arrays.C04_ArrayElementleriToplama;
import ders19_arrays.C05_ArraydeElemanArama;
import ders19_arrays.C06_KullaniciyaArrayOlusturma;

import java.util.Arrays;

public class C03_MethodlariKullanma {
    public static void main(String[] args) {

        // verilen bir int array'in elementlerini 2 artirin

        // verilen bir int array'in elementlerini 2 artirin

        int[] arr= {2,3,4};
        arr= C03_ArrayElementleriniArtirma.elementleri2Artir(arr);
        System.out.println(Arrays.toString(arr)); // [4, 5, 6]

        // arr array'inin elementlerini toplayip sonucu yazdirin
        System.out.println(C04_ArrayElementleriToplama.pozitifElementleriTopla(arr)); // 15

        // arr array'inde 10 element olarak var mi ?
        C05_ArraydeElemanArama.elemanAra(arr,10); // Aranan sayi array'de yok

        // kullanicidan deger alarak bir array olusturun
        int[] yeniArr= C06_KullaniciyaArrayOlusturma.arrayOlustur();
        System.out.println(Arrays.toString(yeniArr));



    }
}
