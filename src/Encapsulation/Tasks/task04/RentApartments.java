package Encapsulation.Tasks.task04;

public class RentApartments {//POJO Class
  //fields
  private   String name;
  private   int roomCount;
  private   boolean balconyOrNo;
    //cons

    public RentApartments(String name, int roomCount, boolean balconyOrNo) {
        this.name = name;
        this.roomCount = roomCount;
        this.balconyOrNo = balconyOrNo;
    }

    public RentApartments() {
    }
    //methods
    private int rent;
    public int rentCalculater(){
                if(roomCount==0){
                    this.rent=1400;
                }else if (roomCount==1){
                    this.rent=1700;
                }else if (roomCount==2){
                    this.rent=2200;
                }else if (roomCount==3){
                    this.rent=2700;
                }


        return this.rent+=getBalcony();
    }
        public int getBalcony(){
        if(balconyOrNo==true){
            return 200;
        }else return  0;
        }
    //getters  setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public boolean isBalconyOrNo() {
        return balconyOrNo;
    }

    public void setBalconyOrNo(boolean balconyOrNo) {
        this.balconyOrNo = balconyOrNo;
    }

    @Override
    public String toString() {
        return
                "Kiracı ismi='" + name + '\'' +
                ", oda sayısı=" + roomCount +
                ", balconyOrNo=" + balconyOrNo +", kiranız "+
               rentCalculater();
    }
}
class Runner {
    public static void main(String[] args) {

        RentApartments obj1=new RentApartments("Murat Bey",2,true);
        obj1.rentCalculater();
        System.out.println("obj1 = " + obj1);


    }

}