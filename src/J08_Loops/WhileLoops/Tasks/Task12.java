package J08_Loops.WhileLoops.Tasks;

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		/*
		 task->girilen bir metinde harf rakam ve özel karakter sayısını print eden code create ediniz.
		do-While loop
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Agam metin giresen");

		String str=sc.nextLine().toLowerCase();//girilen str değeri kucuk harfe atandı
		int harfSayisi=0;
		int rakamSayisi=0;
		int karakterSayisi=0;//karakter harf ve rakam harici her şey
		int strindex=0;
		do{
			if(str.length()==0) {//""boş karakterli str giriş şartı
				System.out.println("Ağam adam gibi sayi gir");
			}else if (str.charAt(strindex) >= 'a' && str.charAt(strindex) <= 'z') {//s a ile z arasındamı
					harfSayisi++;
				} else if (str.charAt(strindex) >= '0' && str.charAt(strindex) <= '9'){//sıfır ila 9 arasındamı
					rakamSayisi++;
			} else 	karakterSayisi++;//özel karekterler

					strindex++;//herlopp bir sonrakiendeksi ver,r


		}while (strindex<str.length());
		System.out.println(" Ağam girdiğin metinde  " +harfSayisi+"tane harf vardır");
		System.out.println(" Ağam girdiğin metinde  " +rakamSayisi+"tane rakam vardır");
		System.out.println(" Ağam girdiğin metinde  " +karakterSayisi+"tane karakter vardır");

	}

}
