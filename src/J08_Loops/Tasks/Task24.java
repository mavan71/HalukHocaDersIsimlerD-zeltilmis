package J08_Loops.Tasks;

import java.util.Scanner;

public class Task24 {

	public static void main(String[] args) {
		/*
		 Task -> girilen  String'in tersini(reverse String) print eden code create ediniz
		 */
		Scanner input=new Scanner(System.in);
		System.out.println("Ağam bir string gir");
		String str=input.nextLine();
		for(int i=str.length()-1; i>=0; i--) {//sondan başlayacak//1.yöntem
			System.out.print(str.charAt(i));

		}
		System.out.println();
		for(int i=0; i<=str.length()-1; i++) {//sıfırdan başlayacak//2.yontem
			System.out.print(str.charAt(str.length()-1-i));
}}
	}





