package Q3_4_5_6_7;

public class Book implements Comparable<Book> {
    private String title;
    private double price;
    private int publishedYear;
    private String author;

    public Book(String title, double price, int publishedYear, String author) {
        this.title = title;
        this.price = price;
        this.publishedYear = publishedYear;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String toString(){
        return "Title: "+ title+". Price: "+price+". Published Year: "+publishedYear+". Author: "+author;
    }

    @Override
    public int compareTo(Book o) {
        if (this.publishedYear > o.publishedYear) {
            return 1;
        } else if (this.publishedYear < o.publishedYear) {
            return -1;
        } else {
            return 0;
        }
    }
}
