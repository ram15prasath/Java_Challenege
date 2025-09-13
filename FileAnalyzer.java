import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileAnalyzer {

    public static void main(String[] args) {
        String fileName = "data.txt";
        int wordCount = 0;
        String longestWord = "";

        // 5. Use a try-with-resources block
        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            // Read words from the file line by line
            while (fileScanner.hasNext()) {
                String word = fileScanner.next();
                wordCount++;

                // 4. Find the longest word
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }

            // 7. Print the results
            System.out.println("Analysis of the file '" + fileName + "':");
            System.out.println("Total word count: " + wordCount);
            System.out.println("The longest word is: " + longestWord);

        } catch (FileNotFoundException e) {
            // 6. Handle the exception
            System.out.println("Error: The file '" + fileName + "' was not found.");
            System.out.println("Please make sure the file exists in the project directory.");
        }
    }
}