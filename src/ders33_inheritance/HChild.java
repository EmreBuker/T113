package ders33_inheritance;

public class HChild extends GParent {

    protected int sayiChild;

    HChild(){
        System.out.println("Child class constructor'i calisti");
    }

    public static void main(String[] args) {

        HChild objChild=new HChild();

        System.out.println(objChild.sayiChild);
        System.out.println(objChild.sayiParent);
        System.out.println(objChild.sayiGrandparent);

        /*
            Child class'dan olusturdugumuz bir obje
            parent ve grandparent class'larindaki tum ozelliklere sahip olur (private ve static haric)

            bir obje olusturuldugunda
            ilk degerleri alabilmesi icin MUTLAKA bir CONSTRUCTOR calismalidir

            Constructor call bizim cok kullandigimiz bir ozellik degildir
            fakat inheritance'i tam olarak anlayabilmek icin
            constructor call konusunu bilmemiz lazım

            Bu class'dan obje olusturmak icin
            HChild() constructor'ini kullandik !!
            Fakat objemiz parent ve grandparent'da ki ozellikleri de sahiplendi

           Her ne kadar objeyi child class'Dan olustursakta
           bu objenin parent  ve grandParent class'larindaki ozellikleri
           alabilmesi icin,o class'larin constructor'lari da calismak ZORUNDADIR

          Java bu mecburi calismayi saglayabilmek icin
          cok ozel bir sistem gelistirmistir

          BUNUN ADI super() : super constructor call'dur
         */
    }
}
