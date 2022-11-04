package Q2;

import java.util.ArrayList;

public class Library {
    public static void main(String[] args) {
        ArrayList<Book> library1 = new ArrayList<>();
        Book b1 = new Book("Jane Mayor", "Anne Anne");
        Book b2 = new Book("Charly's Dog", "Jeo Dove");
        Book b3 = new Book("Sweet Pie", "Poly Christine");

        library1.add(b1);
        library1.add(b2);
        library1.add(b3);

        displayAllBooks(library1);
    }

    public static void displayAllBooks(ArrayList<Book> arrayList){
        for (Book book: arrayList) {
            System.out.println("Title: "+book.title + " || Author: "+ book.author);
        }
    }

}
