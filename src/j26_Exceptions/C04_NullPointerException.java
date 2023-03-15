package j26_Exceptions;

public class C04_NullPointerException {
    public static void main(String[] args) {
        //null PointException

String str1="";
        System.out.println(str1);
        String str2=null;
        //System.out.println("str2.length() = " + str2.length());

        try {
            System.out.println("str2.length() = " + str2.length());
            System.out.println("Ağam bu satırı okuduysan code exception fırlatmadı");
        }catch (NullPointerException e) {
            //}catch (ArithmeticException e) {
            System.out.println("Try exception fırlattı");
            System.out.println("Ağam hele nerde görülmüş  dutluk boyutu TEEE ELLLAAAMMM YAAA");

        }
        try {
            System.out.println("str1.length() = " + str1.length());
            System.out.println("Ağam bu satırı okuduysan code exception fırlatmadı");
        }catch (NullPointerException e) {
            System.out.println("Ağam hele nerde görülmüş  dutluk boyutu TEEE ELLLAAAMMM YAAA");

        }
        System.out.println("app. çalışıyor");
    }





}
