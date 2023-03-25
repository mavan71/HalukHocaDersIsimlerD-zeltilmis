package Encapsulation.encapsulation02;

public class Kişi {//POJO Class
     /* task
    Kisi pojo class için fields-> ad, soyad, password(String), yas
    tum field'ları kullanıcı görebilmeli ve password haric update edebilmeli
    (password encapsulated update edilmemeli.)
    yas variable negatif değer girmeye karsı encapsulated

    runner class'da obj ile field ları print eden code create ediniz
     */

    //fields
  private  String ad="Murat";
  private  String soyad="Avan";
  private  String pasword="123456789MAKAL";
  private  int yas=67;

    public Kişi(String ad, String soyad, String pasword, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.pasword = pasword;
        this.yas = yas;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getPasword() {
        return pasword;
    }


    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if(yas<0){
            this.yas =Math.abs(yas);
        }



    }
}
