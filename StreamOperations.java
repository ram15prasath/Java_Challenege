public import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// 1. Create the Product class
class Product {
    String name;
    double price;

    // 2. Constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class StreamOperations {

    public static void main(String[] args) {
        // 3. Create an ArrayList of Product objects
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1200.0));
        products.add(new Product("Mouse", 25.0));
        products.add(new Product("Keyboard", 75.0));
        products.add(new Product("Monitor", 300.0));
        products.add(new Product("Mousepad", 15.0));

        // 4. Filter products with price > $50
        List<Product> expensiveProducts = products.stream()
            .filter(product -> product.price > 50.0)
            .collect(Collectors.toList());

        System.out.println("Products with price > $50:");
        for (Product p : expensiveProducts) {
            System.out.println(p.name + " - $" + p.price);
        }

        System.out.println("-------------------------");

        // 5. Map filtered products to a list of just their names
        List<String> expensiveProductNames = products.stream()
            .filter(p -> p.price > 50.0)
            .map(p -> p.name)
            .collect(Collectors.toList());

        System.out.println("Names of expensive products:");
        System.out.println(expensiveProductNames);
        
        System.out.println("-------------------------");

        // 6. Calculate the total price of all products
        double totalPrice = products.stream()
            .mapToDouble(p -> p.price)
            .sum();
        
        System.out.println("Total price of all products: $" + totalPrice);
    }
} {
    
}
