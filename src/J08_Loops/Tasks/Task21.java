package J08_Loops.Tasks;

public class Task21 {

    /*
             *
            * *
           * ! *
          * ! ! *
         * ! ! ! *
        * ! ! ! ! *
       * ! ! ! ! ! *
      * * * * * * * *
      şekli print eden code create ediniz.
     */

    public static void main(String[] args) {

        int kenarUzunlugu = 8;
        int ortaNokta = kenarUzunlugu - 1;
        int taban = kenarUzunlugu * 2 - 1;

        for (int i = 0; i < kenarUzunlugu; i++)
        {
            for (int k = 0; k < taban; k++)
            {
                if ((i + k == ortaNokta || k - i == ortaNokta))
                {
                    System.out.print('*');
                }
                else if ((i + k >= ortaNokta && k - i <= ortaNokta))
                {
                    System.out.print("!");
                }
                else if (i == ortaNokta)
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            System.out.println();
        }
    }




    }


