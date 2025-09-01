import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    public static void main(String[] args) {
        // 1. Create a String variable with a sentence
        String sentence = "Java is a popular programming language. Java is widely used for web development.";

        // 6. Call the countWords method
        countWords(sentence);
    }

    /**
     * Counts the frequency of each word in a given string.
     *
     * @param text The input string to be processed.
     */
    public static void countWords(String text) {
        // 4. Create a HashMap to store word frequencies
        Map<String, Integer> wordFrequencies = new HashMap<>();

        // Normalize the string: convert to lowercase and remove punctuation
        String normalizedText = text.toLowerCase().replaceAll("[^a-zA-Z\\s]", "");

        // Split the normalized string into an array of words
        String[] words = normalizedText.split("\\s+");

        // 3. Loop through the words and count frequencies
        for (String word : words) {
            if (!word.isEmpty()) { // Ensure we don't count empty strings
                // Check if the word is already a key in the map
                if (wordFrequencies.containsKey(word)) {
                    // If it exists, get the current count and increment it
                    int count = wordFrequencies.get(word);
                    wordFrequencies.put(word, count + 1);
                } else {
                    // If it's a new word, add it to the map with a count of 1
                    wordFrequencies.put(word, 1);
                }
            }
        }

        // 5. Print the contents of the HashMap
        System.out.println("Word Frequencies:");
        for (String word : wordFrequencies.keySet()) {
            System.out.println(word + ": " + wordFrequencies.get(word));
        }
    }
}