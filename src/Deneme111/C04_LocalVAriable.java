package Deneme111;

public class C04_LocalVAriable {//Clas level

    public static void main(String[] args) {
        int yas=33;//main scope ında creat edilen primitive variable aynı lokale call edildi
        System.out.println("yas = " + yas);
        for (int i = 0; i < 7; i++) {
            System.out.println(yas+" "+i);
            i+=3;
        }
       // i=23;//i lokla dışı call edilmez
    }//main sonu
    //yas.main localde tanımlandığı içinlokal dışı kol edlemez

}
