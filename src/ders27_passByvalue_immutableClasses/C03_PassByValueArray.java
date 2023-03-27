package ders27_passByvalue_immutableClasses;

import java.util.Arrays;

public class C03_PassByValueArray {
    public static void main(String[] args) {

        int [] arr={3,4,5};

        elemanlari5Artir(arr);
        elemanlari5Artir(arr);
        elemanlari5Artir(arr);

        System.out.println("Method call'dan sonra main method icinde arr : " + Arrays.toString(arr));

    }

    public static void elemanlari5Artir(int[]arr){

        for (int i = 0; i < arr.length; i++) {

            arr[i]+=5;

        }

        System.out.println(Arrays.toString(arr));
    }
}
