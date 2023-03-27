package ders14_nestedForLoop_methodOlusturma;

public class C02_C02_StringTersineCevirme {
    public static void main(String[] args) {

        // Soru 10 (interview)- Kullanicidan bir String isteyin ve
        // String'i tersine cevirip kaydedin.

        String input="Java her gecen gun guzellesiyor";
        String tersInput="";

        for (int i =input.length()-1; i>=0 ; i--) {

            tersInput+=input.substring(i,i+1); // i++ neden olmuyor SOR !!

        }

        System.out.println("Ters Hali : " + tersInput);





    }
}
