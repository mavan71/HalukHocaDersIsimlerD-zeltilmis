package j26_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02 {
    public static void main(String[] args) {
        try {//outher try blok , dosyaya erişim
            FileInputStream fis =new  FileInputStream("C:\\Users\\erkan\\IdeaProjects\\githubdan\\src\\j26_Exceptions\\EbikGabık");


       int k;//File den her bir karakterin ascıı değeri atanacağı boş kutu yaptım
 try {


     while (((k = fis.read()) != -1)) {

         System.out.print((char) k);


     }
     System.out.println("Ağam inner try dan selamkee");
 } catch (IOException e) {
              System.out.println("Ağam dosya okunmuyor Boş");
              System.out.println("Ağam inner catch' den selamke");
          }


        } catch (FileNotFoundException e) {
            System.out.println("Ağam dosyaya ulaşılamıyor");
            System.out.println("Ağam outher catch' den selamkee");
        }
        System.out.println("Ağam Başarılıııııı");
    }
}
