package ders39_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_CheckedException {

    public static void main(String[] args) throws FileNotFoundException {

        /*
            Checked exceptions kod yazilir yazilmaz,daha run etmeden
            javanin riskli kodlari tanimlayip
            calistirmadan once bana bir yol gostermelisin dedigi
            exception turleridir

            Checked Exceptions genelde dosya okuma ve yazma IO(input-output) islemlerinde olusur

            Checked exception kodun altini kirmizi cizdiginden
            kodumuzun calisir hale gelmesi icin kirmizi cizgiyi yok etmemiz lazim 24.satir
            1- try catch blogu kullanarak
               exception handle edilebilir
               ve javaya exception olustugunda ne yapmasini istedigimiz gosterilebilir
            2- Eger exception'ı handle etmek istemiyorsak
               sadece kodumuzun calismasini istiyorsak
               method deklarasyonuna bu exception ihtimalinii yazarak
               kodu calisir hale getirebiliriz

               method signature'ini throws keyword'u ile
               beklenen exception turunu yazarsak
               kod calisir
               ANCAK exception olusursa kodun calismasi durur

         */

        String dosyaYolu="src/ders39_exception/text.txt";

        FileInputStream fis=new FileInputStream(dosyaYolu);

    }
}
