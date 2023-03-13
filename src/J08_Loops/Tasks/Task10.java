package J08_Loops.Tasks;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        /* task ->
        girilen bir ifadenin istenen harf sayısını print eden code create ediniz

        input : selam javaCAN'lar
        output : a sayısı :3
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Ağam Bir cümle gir");
        String str=input.nextLine();
        System.out.println("Agam hangi harfi saydıracaksın");
        char harf=input.next().charAt(0);// charat stringin ilk karekterini verir
        int harfSayisi=0;//işlemi etkilemeyecek başlangıç değeri
        for( int i=0;i<=str.length()-1 ;i++ ){//str ilk harf 0 dan son harfin indexi length-1 e kadar git.
            if(str.charAt(i)==harf){//tekrardan gelen ifadenin her bir harfini istenen harfe eşitliğini kontrol eder.
                harfSayisi++;//harfSayisi+=1;
            }
        }

        System.out.println("Ağam girdiğin ifade :" +str+"de istediğin harf: "+harf+harfSayisi+" kadar var");


    }
}
