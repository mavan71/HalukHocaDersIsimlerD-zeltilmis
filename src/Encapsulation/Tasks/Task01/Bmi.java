package Encapsulation.Tasks.Task01;

public class Bmi {

    //1-Fields
  private String name;
  private int age;
  private double weight;
  private double height;


    public Bmi(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    // to String

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height + getStatus1();
    }

    public double getBMI1() {


        return (weight/(height*height));
    }
    public String getStatus1() {
        if( getBMI1()<18.5){
            return "zayıfsın";
        }else if(getBMI1()<25){
            return "normalsin";
        }else if(getBMI1()<30){
            return "klolusun";
        }else return "aşırı kilolusun";

    }


}//clas sonu
