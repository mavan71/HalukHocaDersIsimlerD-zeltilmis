package Deneme111;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task03 {


    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {


        /*Task->
        1-Ekleme
        2-Listeleme
        3-Arama
        4-Düzeltme
        5-Çıkış
        Seçeneklerini vererek username(key),password, userType (Müdür, çalışan) dan oluşan bir Map tanımlayınız.
        Kullanıcının seçimine göre Her bir işlemi ayrı metodda yaptırınız.
        Mainde  Seçenekler ve metodların call edip run ediniz.

         */

        Map<String, Map<String, String>> user = new HashMap<>();

       islemYap();




    }

    public static void islemYap() {
        System.out.println("************HOŞ GELDİNİZ***************" +
                "\n Lütfen Menüden Bir İşlem Seçiniz" +
                "\n 1- Ekleme \n 2- Listeleme \n 3-Arama \n 4-Düzeltme \n 5-Silme \n 6-Çıkış");

        int secim = scan.nextInt();
        switch (secim) {
            case 1:
                userEkle();
                break;
            case 2:
                //   userListele();
                break;
            case 3:
                //   userAra();
                break;
            case 4:
                //   userDüzelt();
                break;
            case 5:
                //    userSil();
                break;
            case 6:
                cıkısYap();
                break;
            default:
                System.out.println("Hatalı giriş yaptınız. Lütfen Tekrar deneyiniz");
                islemYap();
        }
    }

    public static void userEkle() {
        System.out.println();
        userNameAta();
        System.out.println();
        passwordAta();

        userTypeAta();

        Map<String, String> user = new HashMap<>();
        user.put(passwordAta(), userTypeAta());
        Map<String, Map<String, String>> users=new HashMap<>();
        users.put(userNameAta(), user);
    }

    public static String userNameAta() {
        System.out.println("Lütfen 10 karakteri aşmayan bir kullanıcı adı giriniz");

        String userName = scan.next();

        if (userName.length() < 10) {
            System.out.println("Kullanıcı adınız " + userName + " olarak tanımlanmıştır");
        }
        return userName;
    }


    public static String passwordAta() {
        boolean result = true;
        String password="";
        while (result) {
            System.out.println("Lütfen 6 karakter olacak şekilde bir password belirleyiniz");
            password = scan.next();
            if (password.length() == 6) {
                System.out.println("password başarıyla tanımlanmıştır");
                result = false;
            }
        }
        return password;
    }

    public static String userTypeAta() {
        System.out.println("Lütfen kullanıcı tipini seçiniz" +
                "\n Müdür için 1'e \n Çalışan için 2'ye basınız");
        int kullanıcı = scan.nextInt();
        String userType="";
        switch (kullanıcı) {
            case 1:
                userType = "Müdür";
                break;
            case 2:
                userType = "Çalışan";
                break;
            default:
                System.out.println("hatalı giriş yaptınız Lütfen tekrar deneyiniz");
                userTypeAta();
        }
        return userType;
    }

        public static void cıkısYap () {
            System.out.println("Çıkış İşlemi Başarıyla Gerçekleştirilmiştir" +
                    "\n ********İyi günler dileriz********");
        }
    }

