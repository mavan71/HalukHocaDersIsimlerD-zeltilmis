package Encapsulation.Tasks.task03;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class Employees {
    //1--> Fields
  private String name;
  private int salary;
  private String dob;
    //2--> Consç


    public Employees(String name, int salary, String dob) {//p' li constructor
        this.name = name;
        this.salary = salary;
        this.dob = dob;
    }

    public Employees() {//p' siz constructor
    }

    //task Metho
    public  int  ageCalculator(){
        DateTimeFormatter dtf;
        dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return Period.between(LocalDate.parse(dob,dtf),LocalDate.now()).getYears();
    }
    public String yasKontrol(){
        if(ageCalculator()>18){
            return "Welcome to our Company "+name+ " your salary is " +salary;
        } else if(ageCalculator()<18){
            return "come back when you are 18 years old .";

        }else  return "we can have inter with you after that you can have a come back when you are 18 years old "+ salary+" salary";
    }
    //3-->Getter ve setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
    //4-->To String

    @Override
    public String toString() {
        return yasKontrol();
    }
}//employees class sonu





class Runner{
    public static void main(String[] args) {

        Employees obj1=new Employees("Murat",100000,"1978-11-23");
        System.out.println("obj1 = " + obj1);
        obj1.ageCalculator();
        Employees obj2=new Employees("sefi murat",50000,"2005-03-30");
        System.out.println("obj2 = " + obj2);
        Employees obj3=new Employees("Mümin",10000,"2013-11-23");
        System.out.println("obj3 = " + obj3);

    }
}
