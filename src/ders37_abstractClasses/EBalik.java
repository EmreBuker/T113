package ders37_abstractClasses;

public abstract class EBalik extends AHayvan{

    public void hareket(){
        System.out.println("Baliklar yüzer");
    }

    public void solunum(){
        System.out.println("Baliklar solungac solunumu yapar");
    }

    public void cogalma(){
        System.out.println("Baliklar yumurta ile cogalir");
    }

    public abstract void yuzgec();
    public abstract void yasamAlani();
    public abstract void iskeletYapisi();
}
