import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileSumCalculator {

    public static void main(String[] args) {
        // Define the name of the file to be read
        String fileName = "input.txt";
        int sum = 0;

        // Use a try-with-resources block for automatic resource management
        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            // Read numbers from the file line by line
            while (fileScanner.hasNextInt()) {
                int number = fileScanner.nextInt();
                sum += number;
            }
            
            // Print the final sum after the loop finishes
            System.out.println("Successfully read from file.");
            System.out.println("The sum of the numbers is: " + sum);
            
        } catch (FileNotFoundException e) {
            // 4. Handle the exception and print an error message
            System.out.println("Error: The file '" + fileName + "' was not found.");
            System.out.println("Please make sure the file exists in the project directory.");
        }
    }
}