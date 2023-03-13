package J20_Constructor;

public class C02_Arac {//class level
    //fields...ins. variable -> obj variable
    String marka;
    String model;
    int km;
    double motorHacim;
    boolean automatic;
    boolean ikinciEl;
    int yil;




    public static void main(String[] args) {//main level
        /*
        Task-> fields: marka,model,km,motorHacim,vitesAotu,ikinciel,yıl olan
         3 obj  create ederek fields print eden code create ediniz.
         */

        C02_Arac arc1=new C02_Arac();
        arc1.marka="Volvo";
        arc1.model="S80";
        arc1.km=95000;
        arc1.automatic=true;
        arc1.ikinciEl=true;
        arc1.motorHacim=2.0;
        arc1.yil=2015;
       // System.out.println("arc1 = " + arc1);// j20_Constructor.C02_Arac@7f690630-> ref data-
        System.out.println("arc1 -->  " + arc1);// tostring() meth dan dolayı obj'nin tum field'ları prınt eder

        //                    volvo,                S80               95000              2015            2.0                     true                   t
        System.out.println(arc1.marka + ", " + arc1.model + ", " + arc1.km + ", " + arc1.yil + ", " + arc1.motorHacim + ", " + arc1.automatic+", "+arc1.ikinciEl);



        C02_Arac arc2=new C02_Arac();
        arc2.marka="tosbaaa";
        arc2.model="bidıls";
        arc2.km=9999;
        arc2.automatic=false;
        arc2.ikinciEl=true;
        arc2.motorHacim=3.14;
        arc2.yil=1905;

        System.out.println("arc2 ==> " +arc2);//


        C02_Arac arc3=new C02_Arac();
        arc3.marka="mersedes";
        arc3.model="e200";
        arc3.km=77000;
        arc3.automatic=true;
        arc3.ikinciEl=true;
        arc3.motorHacim=1.8;
        arc3.yil=2010;

        System.out.println("arc3 ==> " + arc3);//
    }//main sonu

   @Override
   public String toString() {//bu meth obj datalarını String'e convert eder.
       return
               "marka='" + marka + '\'' +
                       ", model='" + model + '\'' +
                       ", km=" + km +
                       ", motorHacim=" + motorHacim +
                       ", automatic=" + automatic +
                       ", ikinciEl=" + ikinciEl +
                       ", yil=" + yil ;
   }
 // @Override
 // public String toString() {
 //     return "C02_Arac{" +
 //             "marka='" + marka + '\'' +
 //             ", model='" + model + '\'' +
 //             ", km=" + km +
 //             ", motorHacim=" + motorHacim +
 //             ", automatic=" + automatic +
 //             ", yil=" + yil +
 //             '}';
 // }
}//class sonu
