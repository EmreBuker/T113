package ders12_StringManipulation;

public class C02_replace {
    public static void main(String[] args) {
        String str = "Java candir";

        System.out.println(str.replace('a', 'A'));//JAvA cAndir

        System.out.println(str.replace(' ', '_'));// bosluk yerine altcizgi yapicak

        System.out.println(str.replace("candir", "cok guzeldir"));// string olarak degistirdik

        System.out.println(str.replace(" ", "")); // kelimeleri birleştirdik,bosluk gitti

        // String'de ki tum a'lari silin
        System.out.println(str.replace("a", ""));

        // Java yerine hava,candir yerine cok guzel yazdiralim

        System.out.println(str.replace("Java", "Hava") // Hava cok guzel
                .replace("candir", "cok guzel"));

        System.out.println(str.replace("", "_"));//_J_a_v_a_ _c_a_n_d_i_r_

        // sadece 1.a'yi A yapin
        System.out.println(str.replaceFirst("a", "A"));// replaceFirst ilk A ' yi buyuk yaptık
        // Fkat bu methodda char olmuyo yalnızca String


    }
}
