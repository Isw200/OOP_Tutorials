package Q3_4_5_6_7;

import java.util.*;

public class BookTester {
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>(); //create an ArrayList of Q3.Book objects
        Scanner input = new Scanner(System.in);

        //create 3 Q3.Book objects and add them to the ArrayList
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the title of the book: ");
            String title = input.nextLine();
            System.out.println("Enter the author of the book: ");
            String author = input.nextLine();
            System.out.println("Enter the price of the book: ");
            double price = input.nextDouble();
            System.out.println("Enter the year the book was published: ");
            int publishedYear = input.nextInt();
            input.nextLine(); //consume the newline character
            bookList.add(new Book(title, price, publishedYear, author));
        }


        Collections.sort(bookList);

        for (Book book : bookList) {
            System.out.println(book);
        }

        HashMap<Book, Integer> hashMap = new HashMap<Book, Integer>();

        for (int i = 0; i < bookList.size(); i++){
            System.out.println ("Please, enter the number of the shelf where is placed the book" + bookList.get(i).getTitle());
            int numShelf = input.nextInt();
            /*Adding elements to HashMap*/
            hashMap.put(bookList.get(i), numShelf);
        }

        System.out.println("Insert the number of the shelf");
        int selectedShelf = input.nextInt();
        System.out.println("The book in shelf " + selectedShelf + " are:");
        /* Display content using Iterator*/
        Set set = hashMap.entrySet();
        Iterator iterator = set.iterator();

        while(iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();

            if (selectedShelf == (int) entry.getValue()) {
                System.out.println(((Book) entry.getKey()).getTitle());
            }
        }
    }
}
