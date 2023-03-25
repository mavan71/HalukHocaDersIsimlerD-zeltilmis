package Encapsulation;

public class personel {
    private String name="adenm";
    private String kimlikNo="555555555";
    private String meslek="takniker";
    private int yas;

    public String getName() {
        return name;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
       if(yas<18){
           this.yas=18;
           System.out.println("yaşınız 18 den küçük");

       }else {
           this.yas=yas;
       }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }


    public String getMeslek() {
        return meslek;
    }

    public void setMeslek(String meslek) {
        this.meslek = meslek;
    }
}
