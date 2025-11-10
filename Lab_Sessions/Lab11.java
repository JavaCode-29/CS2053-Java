import java.util.*;

class Product {
    String name;
    double price;
    
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public String toString() {
        return name + " - $" + price;
    }
}

public class Lab11 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1200.00));
        products.add(new Product("Mouse", 25.00));
        products.add(new Product("Keyboard", 75.00));
        products.add(new Product("Monitor", 300.00));
        products.add(new Product("Headphones", 50.00));
        
        System.out.println("Original List:");
        for (Product p : products) {
            System.out.println(p);
        }
        
        System.out.println("\nSorted by Price:");
        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        for (Product p : products) {
            System.out.println(p);
        }
        
        System.out.println("\nSorted by Name:");
        products.sort((p1, p2) -> p1.name.compareTo(p2.name));
        for (Product p : products) {
            System.out.println(p);
        }
        
        System.out.println("\nSorted by Price (Descending):");
        products.sort((p1, p2) -> Double.compare(p2.price, p1.price));
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
