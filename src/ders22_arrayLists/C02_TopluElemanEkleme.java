package ders22_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C02_TopluElemanEkleme {
    public static void main(String[] args) {

        List<String> harfler = new ArrayList<>();

        // tum sesli harfleri listeye ekleyin
        // eklenecek tum elementleri bir array olarak yazip
        // sonra for loop ile list'e ekleyebiliriz

        String [] arr= {"a","e","i","o","u"};

        for (int i = 0; i < arr.length ; i++) {

            harfler.add(arr[i]); // anlami ; list'e ekle,neyi i'yi
        }

        System.out.println(harfler); // [a, e, i, o, u]
    }
}
