package ders34_inheritance;

import java.sql.SQLOutput;

public class CToyota extends BAraba {

    String str2="Toyota";

    protected CToyota (){
        System.out.println("Parametresiz Toyota constructor calisti");
    }

    protected CToyota(int sayi){

        System.out.println("int parametreli toyota constructor calisti");

    }

    protected CToyota(String s){

        System.out.println("String parametreli toyota constructor calisti");

    }
}
