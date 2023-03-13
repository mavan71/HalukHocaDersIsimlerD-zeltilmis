package j15_Varargs;

public class Task03bucuk {
    public static void main(String[] args) {
        /*
Task ->  girilen bir sayı ile girilen String'lerin en uzun harf sayısını çarpıp print eden METHOD create ediniz.
 */

        int sayi1 = 7;
        String str1="sefil javacı Haluk";//
        String str2="perfect javacı Abdulhamit";//
        String str3="beleştepe muhtarı CEREN hanım";//

        çarpUzunString(sayi1, str1, str2, str3);

    }//Main sonu

    private static void çarpUzunString(int sayi1, String...str) {
        String enUzunString="";
        for (String w:str) {
            if(w.length()>enUzunString.length()){
                enUzunString=w;
            }


        }
    }


}
