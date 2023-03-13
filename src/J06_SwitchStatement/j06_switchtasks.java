package J06_SwitchStatement;

import java.util.Scanner;

public class j06_switchtasks {
    public static void main(String[] args) {



    Scanner scan = new Scanner(System.in);
            System.out.println("Pazartesi: 1\nSalı : 2\nÇarşamba: 3\nPerşembe: 4\nCuma: 5\nCumartesi: " +
                    "6\nPazar: 7\n Haftanın kaçıncı gününde olduğununuzu giriniz : ");

    int gun=scan.nextInt();

    if ((gun<1) || (gun >7)) {
            System.out.println("Hatalı gün girdiniz");
        }
        gun=(gun+100)%7;
    switch(gun){
        case 0:
            System.out.println("cuma");
        case 1:
            System.out.println("pazartesi");
            break;
        case 2:
            System.out.println("salı");
            break;
        case 3:
            System.out.println("carsamba");
            break;
        case 4:
            System.out.println("persembe");
            break;
        case 5:
            System.out.println("cuma");
            break;
        case 6:
            System.out.println("cumartesi");
            break;
        case 7:
            System.out.println("pazar");
            break;

        default:
            System.out.println("agam doğru sayı gir");




                }
    }


}
