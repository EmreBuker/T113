package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C07_Scanner {

    public static void main(String[] args) {
        // Soru 3: Kullanicidan ismini,soyismini ve yasini alip asagidaki formatta yazdirin
        // isminiz : John
        //soyisminiz : Doe
        //yasiniz : 44
        //kaydiniz basariyla tamamlanmistir

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi girin"+"\nLutfen soyisminizi girin"+"\nLutfen yasinizi girin");
                                               //alt satira inmesi icin \n yazdik
        String isim= scan.nextLine();
        String soyisim=scan.nextLine(); // next sadece ilk space'a kadar olan kismi alir
                                        //nextLine ise o satirda yazan tum bilgiyi alir
        int yas= scan.nextInt();// kullanici yasini küsüratlı söylemesine ihtimaline karsilik double olarakta
                                //yazdirabilirdik

        System.out.println("isminiz : "+ isim + "\nsoyisminiz:"+soyisim + "\nyasiniz:" +yas + "\nkaydiniz basariyla tamamlanmistir");







    }
}
