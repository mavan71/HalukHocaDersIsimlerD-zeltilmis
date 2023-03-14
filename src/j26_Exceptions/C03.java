package j26_Exceptions;

public class C03 {
    public static void main(String[] args) {
        // ClassCastException -> Biribirine dönüştürülemeyen  data type'lar dönüştürme işleminde oluşan Run Time Exception

    Object obj= "JavaCAN lara selam";
        System.out.println("obj = " + obj);
        String str = (String) obj;//Object data type String data type casting yapıldı
        System.out.println("str = " + str);


        Object sayi =33;
        //String str1 = (String) sayi;//Object data type String data type casting yapıldı
        //System.out.println("str1 = " + str1);//ClassCastException firlatt
    try {
        String str1 = String.valueOf(sayi);
       String str3 = (String) sayi;
        System.out.println("Ağam try bloktan selam try sorunsuz çalıştı");
    }catch (ClassCastException e){
        System.out.println("Ağam integre data type String olurmu");
        System.out.println("Ağam bu yazıyı olkusudydsa app. catch yakaladı");
    }
        System.out.println("Ağam app. Başarılı");

    }
}
