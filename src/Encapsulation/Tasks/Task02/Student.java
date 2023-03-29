package Encapsulation.Tasks.Task02;

import java.util.Scanner;

public class Student {
private String isim;
private int yas;

    public Student(String isim, int yas) {
        this.isim = isim;
        this.yas = yas;
    }

    public Student() {
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "Student name is='" + isim +"\n"+ "He is :"+ yas+"  years old";
    }
}

class StudentRunner1 {//inner class level

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Adını girese Ağam");
        String ad=input.nextLine();
        System.out.println("YAşını girese Ağam");
        int yas=input.nextInt();


        Student ogrc1 =new Student(ad,yas);


        System.out.println("Student name is : "+ogrc1.getIsim());
        System.out.println("He is "+ogrc1.getYas()+" years old");
        Student ogrc2 = new Student("vedat",23);
        System.out.println("ogrc2 = " + ogrc2);


    }//main sonu
}//inner class sonu