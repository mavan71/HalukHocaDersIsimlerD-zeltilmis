package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		/* Task->
		 Kullanıcıdan cinsiyetini girmesini isteyin.
Erkek ise yaşını kontrol edin. Yaşı 18 den küçük ise ekrana “Erkek çocuk” yazdırın.
Yaşı 18 den büyük eşit ise ekrana “Adam” yazdırın.
Kadin ise yasini kontrol edin. Yaşı 18 den küçük ise ekrana “Kız çocuk” yazdırın.
Yaşı 18 den büyük eşit ise ekrana “Kadın” yazdırın.
		 */
	Scanner scan =new Scanner(System.in);
		System.out.println("Cinsiyet Giriniz");
	String cnsyt =scan.next();
		System.out.println("Yaş Giriniz");
		int yas=scan.nextInt();


Long a=123L;
boolean c=true;
boolean d=false;
		System.out.println(c+" "+d);








	//if (cnsyt.equals("Erkek")){
	//	if (yas<18){
	//		System.out.println("Erkek Çocek");
	//	}
	//	else {System.out.println("Adam");}
	//}
	//else if (cnsyt.equals("Kadın")){
	//	if (yas<18) {
	//		System.out.println("Kız Çocuğu");
	//	}
	//	else {
	//		System.out.println("Kadın");
	//	}
//
	//}
	//	if (yas>18) {
	//		System.out.println("Artk reşitsin");
	//	}
	//	else {
	//		System.out.println("Büyüde Gel");
	//	}

		
	}
}
