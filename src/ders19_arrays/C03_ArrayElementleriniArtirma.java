package ders19_arrays;

import java.util.Arrays;

public class C03_ArrayElementleriniArtirma {
    public static void main(String[] args) {

        // Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method olusturun.
        // Eski array’i yeni haliyle kaydedin.

        int [] arr={2,4,6,8};

        elementleri2Artir(arr);

        System.out.println(Arrays.toString(arr));

    }

    public static int [] elementleri2Artir(int[] arr){
        for (int i = 0; i <arr.length; i++) {

            arr[i]+=2;

        }

        return arr;
    }

}