package ders14_nestedForLoop_methodOlusturma;

public class C01_ForLoopSoru {
    public static void main(String[] args) {

        // interview Soru ; kullanicidan bir String isteyin ve String'i tersten yazdirin
        
        String input="Java ne kadar guzel";

        for (int i = input.length()-1; i>=0 ; i--) { // tersten yani sondan basliycagimiz icin
                                                    // length -1 aldik,i-- yapmamizin sebebi ise
                                                    // tersten gidicek olmasi

            /*

            i>=0 i sıfıra esit oluncaya kadar devam edicek
            yani sıfıra esit olması en bastaki karaktere
            gelmesi demek

             */
            System.out.print(input.charAt(i));

        }
    }
}
