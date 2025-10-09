class Book {
    private String title;
    private String author;
    private double price;
    
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }
    
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0;
    }
    
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    public void displayDetails() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: $" + this.price);
        System.out.println();
    }
}

public class Lab1Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.displayDetails();
        
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        book2.displayDetails();
        
        Book book3 = new Book("1984", "George Orwell", 15.99);
        book3.displayDetails();
    }
}
