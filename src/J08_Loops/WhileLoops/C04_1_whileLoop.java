package J08_Loops.WhileLoops;

public class C04_1_whileLoop {
    public static void main(String[] args) {
        //3 basmaklı 4 ile bolunen sayıları code et
        int sayi=100;
        while(sayi<1000){
            if(sayi%4==0){
                System.out.println("sayi " + sayi);
            }
            sayi++;
        }
    }

}
