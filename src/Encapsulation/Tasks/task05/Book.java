package Encapsulation.Tasks.task05;

import java.util.Scanner;

public class Book {//POJO class// outher class level
    //F
   private String bookName;
   private String author;

    //C
    public Book(String bookName) {
        this.bookName = bookName;
       // this.author = author;
    }

    public Book() {
    }
    // Getter ve Setter


    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    //To String Method

    @Override
    public String toString() {
        return
                "Book name is " + bookName +
                " Author is " + author ;

    }
}// outher class sonu

class BookRunner{//inner class level
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Ağam Hangi Kitabı Mutaala Edirsen");
        String ağanınKitabı = input.nextLine();
        System.out.println("Ağam Müellifi Kim");
        String eserMüellifi=input.nextLine();
      Book b1=new Book(ağanınKitabı);

        System.out.println("b1 = " + b1);
        b1.setAuthor(eserMüellifi);
        System.out.println("b1 = " + b1);
    }
}// inner class sonu
