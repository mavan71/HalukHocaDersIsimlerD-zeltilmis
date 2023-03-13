package j12_Arrays.Tasks1;

import java.util.Arrays;

public class Task11 {
    public static void main(String[] args) {
        /*
		 TASK :
		 $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup print eden code create ediniz.
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */


      String str1 = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
      int dolarSum =0;
      int poundSum = 0;
      String[] strArray = str1.split(" ");
      for (String s : strArray) {
          if(s.startsWith("$")){
              dolarSum += Integer.parseInt(s.substring(1));
          }else if(s.startsWith("£")){
              poundSum += Integer.parseInt(s.substring(1));
          }
      }
      System.out.println("\"Total sum of $ signs\" = " + dolarSum);
      System.out.println("\"Total sum of £ signs\" = " + poundSum);

        String str2 = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4";
        int dolarTop=0;
        int paundTop=0;
        String Arr[]=str2.split(" ");
        System.out.println(Arrays.toString(Arr));
        for (int i = 0; i < Arr.length; i++) {

            if(Arr[i].startsWith("$")){


                dolarTop = dolarTop + Integer.parseInt(Arr[i].substring(1));
            }else if(Arr[i].startsWith("£")){
                paundTop+=Integer.parseInt(Arr[i].substring(1));

            }
        }
        System.out.println("$"+dolarTop);
        System.out.println("£"+paundTop);
    }
}
