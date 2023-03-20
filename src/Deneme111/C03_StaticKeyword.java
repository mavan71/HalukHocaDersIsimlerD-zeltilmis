package Deneme111;

public class C03_StaticKeyword {

    int ogrcId;
    static int ogrcSayisi;
    public C03_StaticKeyword(){
        ogrcSayisi++;
        ogrcId+=ogrcSayisi;
    }
    public static void main(String[] args) {
        System.out.println("ogrcSayisi = " + ogrcSayisi);//0
        C03_StaticKeyword a=new C03_StaticKeyword();
        System.out.println("ogrcSayisi = " + ogrcSayisi);//1

        C03_StaticKeyword b=new C03_StaticKeyword();
        C03_StaticKeyword c=new C03_StaticKeyword();
        C03_StaticKeyword d=new C03_StaticKeyword();

        System.out.println("ogrcSayisi = " + ogrcSayisi);//4
        C03_StaticKeyword e;
        System.out.println("ogrcSayisi = " + ogrcSayisi);//4

        System.out.println("a.ogrcId = " + a.ogrcId);//1
        System.out.println("a.ogrcId = " + b.ogrcId);//2
        System.out.println("a.ogrcId = " + c.ogrcId);//3
        System.out.println("a.ogrcId = " + d.ogrcId);//4
        //System.out.println("a.ogrcId = " + e.ogrcId);
        System.out.println("ogrcSayisi = " + ogrcSayisi);//4


    }

}
