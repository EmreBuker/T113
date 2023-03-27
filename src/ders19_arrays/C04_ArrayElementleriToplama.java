package ders19_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C04_ArrayElementleriToplama {
    public static void main(String[] args) {

        // Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip
        // sonucu bize donduren bir method yaziniz.

        int[] arr={3,-3,5,-7,-6,1,-2};

        System.out.println(pozitifElementleriTopla(arr)); // Arrays.toString yapmadik cunku
                                                          // bizden arr istemedi sayi toplami istedi

    }

    public static int pozitifElementleriTopla(int[]arr){

        int toplam=0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]>0){

                toplam+=arr[i];

            }

        }

        return toplam;
    }

}
