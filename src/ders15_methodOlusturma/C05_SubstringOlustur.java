package ders15_methodOlusturma;

public class C05_SubstringOlustur {

    /*
    Soru 1- Kullanicidan input olarak bir String alin,
    baslangic ve bitis indexlerine gore baslangic index'i dahil, bitis index'i haric olacak sekilde
    aradaki harfleri yazdiran bir method olusturun.
    - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata mesaji verin
    - kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji yazdirin.
     */
    public static void main(String[] args) {

        String input = "Java ne kadar guzel";
        int ilkIndex = 5;
        int sonIndex = 7;

        KendiSubstringMethodumuz(input,ilkIndex,sonIndex);
        KendiSubstringMethodumuz("Java",1,3); // av
        KendiSubstringMethodumuz("Deneme",6,3); // Baslangic indexi, bitis indexinden buyuk olamaz
        KendiSubstringMethodumuz("Java",6,8); // Bitis indexi String'in sinirlari disinda
    }
    public static void KendiSubstringMethodumuz(String input, int ilkIndex, int sonIndex) {
                            // void var burda Onemli !!

        if (ilkIndex > sonIndex) {
            System.out.println("Baslangic indexi son indexten buyuk olamaz Hatalı İslem");
        } else if (sonIndex >= input.length()) {
            System.out.println("Son index String'in sınırları dısında olamaz");
        } else {
            //     baslangic ve bitis indexlerine gore baslangic index'i dahil,
            //     bitis index'i haric olacak sekilde
            //     aradaki harfleri yazdiran bir method olusturun.

            for (int i = ilkIndex; i < sonIndex; i++) {
                System.out.print(input.charAt(i));

            }
        }
    }
}




