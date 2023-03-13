package J08_Loops.WhileLoops.Tasks;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		/*
		task-> girilen  isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar olan
		 butun harfleri ayni satirda aralarina bosluk birakarak print eden code create ediniz

		 */
		Scanner input = new Scanner(System.in);
		System.out.print("İsim ve soy isminizi giriniz: ");
		String isim = input.nextLine();
		String bos="";
		int i=0;
		while(i<isim.length()){
			bos+=isim.charAt(i)+" ";
			i++;
		}
		System.out.print("Harflerin arasına bosluk eklendi: " + bos);
			

	}

}
