import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

// 2. Create the Product class
class Product {
    private int id;
    private String name;
    private double price;

    // 3. Constructor
    public Product() {} // Default constructor is required by Jackson

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // 3. Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

public class JsonDeserializationExample {

    public static void main(String[] args) {
        // 4. Create a String variable holding JSON data
        String jsonString = "{\"id\": 1, \"name\": \"Laptop\", \"price\": 1200.50}";

        // Create an ObjectMapper object
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            // 5. Deserialize the JSON string into a Product object
            Product product = objectMapper.readValue(jsonString, Product.class);

            // 6. Access the object's data and print it
            System.out.println("Product ID: " + product.getId());
            System.out.println("Product Name: " + product.getName());
            System.out.println("Product Price: $" + product.getPrice());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}