package j10_MethodCreation;

public class C05_methodOverloading {
    /*

     */
    public static void main(String[] args) {
        topla(2,3);
        topla(2.3,3.5);
        topla(2.3,3);
        topla(2,3.4);
        topla('h','h');
        topla('t',34,'d');
        topla(Integer.parseInt("2"),3);


    }//main sonu

    public static void topla(int sayi1, int sayı2){
        System.out.println("int int type method run edildi :"+(sayi1+sayı2));
            }
    public static void topla(double sayi1, int sayı2){
        System.out.println("double int type method run edildi :"+(sayi1+sayı2));
    }
    public static void topla(int sayi1, double sayı2){
        System.out.println("int double type method run edildi :"+(sayi1+sayı2));
    }
    public static void topla(double sayi1, double sayı2){
        System.out.println("double double type method run edildi :"+(sayi1+sayı2));
    }public static void topla(double sayi1, double sayı2,int sayi3){
        System.out.println("double double int type method run edildi :"+(sayi1+sayı2));
}}//class sonu
