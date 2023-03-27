package ders38_interfaces;

import java.util.ArrayList;
import java.util.List;

public class C02_ChildOfI01veI03 implements I01_Interface,I03_Interface{
    @Override
    public void toplama() {

    }

    @Override
    public void cikarma() {

    }

    @Override
    public String ekleme() {
        return null;
    }

    @Override
    public int faktoryel() {
        return 0;
    }

    @Override
    public void bolme() {

    }

    public static void main(String[] args) {
        C02_ChildOfI01veI03 obj = new C02_ChildOfI01veI03();



        System.out.println(I01_Interface.str);
        System.out.println(I03_Interface.str);

        System.out.println(I02_Interface.str);

        List<String> harfler= new ArrayList<>();

    }
}
