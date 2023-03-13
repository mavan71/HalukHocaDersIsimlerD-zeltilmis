package J08_Loops.Tasks;

public class Task11 {
    public static void main(String[] args) {

        /*
        A    //1. satıra 1 harf//1. katta 1 daire var
        A B  //2. satıra 2 harf
        A B C //3. satıra 3 harf
        A B C D //4. satıra 4 harf//4. katta 4 daire var
        A B C D E
        A B C D E F
        şekli print eden code create ediniz.  65=A'nın ascıı değeri

        */
int harf =65;
for (int kat=0; kat<6;kat++){
    for(int daire =0;daire<=kat; daire++){
        System.out.print((char) (harf+daire)+ " ");//harf+daire 65 olu char alınca A olu
    }
    System.out.println();
}


    }
}
