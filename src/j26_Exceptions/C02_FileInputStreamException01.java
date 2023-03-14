package j26_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_FileInputStreamException01 {
   public static void main(String[] args) throws IOException {

        FileInputStream fis =new  FileInputStream("C:\\Users\\erkan\\IdeaProjects\\githubdan\\src\\j26_Exceptions\\EbikGabık");


        int k;
        while ((k = fis.read()) != -1){
            System.out.print((char) k);
        }






    }

}
