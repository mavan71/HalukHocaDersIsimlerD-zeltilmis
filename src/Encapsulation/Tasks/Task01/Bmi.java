package Encapsulation.Tasks.Task01;

public class Bmi {

    //1-Fields
  private String name;
  private int age;
  private double weight;
  private double height;

        //2-cons.
    public double getBMI() {
        return weight/(height*height);
    }
    public String getStatus() {
        if(getBMI()<18.5){
            return "zayifsın ";
        }else if(getBMI()<25){
            return "normalsin";
        }else if(getBMI()<30){
            return "kilolusun";
        }else return "obezsin";


    }
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
                ", height=" + height + getStatus();
    }
}
