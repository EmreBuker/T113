package ders11_StringManipulation;

public class C09_Soru {
    public static void main(String[] args) {

        // Kullanicidan bir cümle ve bir metin alin
        // cümlede metnin durumuna gore
        // 1- cumle metni icermiyor
        // 2-cumle metni sadece 1 kere iceriyor
        // 3-cumle metni birden fazla iceriyor
        //seceneklerinden uygun olani yazdirin

        // 7. soruyla aynı fakat last ile cozucez

        String cumle="Java cok guzeldir cok";
        String metin="cok";

        int ilkIndex=cumle.indexOf(metin);
        int sonIndex=cumle.lastIndexOf(metin);

        if (ilkIndex==(-1)){
            System.out.println("cumle metni icermiyor");
        } else if (ilkIndex==sonIndex) {
            System.out.println("cumle metni sadece 1 kere iceriyor");

        }else System.out.println("cumle metni birden fazla iceriyor");

        /*
        Sorunun mantigi su ; ilk indexle son index birbirine esit olmadigi icin birden fazla iceriyor hukmune vardik
        ilk index aramayi bastan,son index sondan baslatıyor

         */
    }
}
