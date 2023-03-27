package ders21_multiDimensionalArrays;

public class C04_MDA_CiftSayiAdedi {
    public static void main(String[] args) {

        // Verilen iki katli bir int array'deki cift sayi adedini bulan kod yaziniz

        int[][] arr= {{4,6},{3,5,8},{1,0,4}};

        int sayac=0; // cift sayi adedini bulmak icin olusturduk

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j]%2==0){
                    sayac++;

                }
            }
        }
        System.out.println("Cift sayi adedi : "+ sayac); // 5
    }
}
