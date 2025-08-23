public class ArrayAverage {

    public static void main(String[] args) {
        // 1. Create an array of at least five integers
        int[] numbers = {10, 25, 30, 45, 50, 60};

        // 4. Call the findAverage method and store the returned value
        double average = findAverage(numbers);

        // 5. Print the returned average to the console
        System.out.println("The average of the numbers is: " + average);
    }

    /**
     * This method calculates the average of all elements in an integer array.
     * * @param arr The integer array to be processed.
     * @return The average of the array elements as a double.
     */
    public static double findAverage(int[] arr) {
        // Initialize a variable to store the sum of all numbers
        int sum = 0;

        // 3. Loop through the array and calculate the sum
        for (int number : arr) {
            sum += number;
        }

        // Return the average by dividing the sum by the number of elements
        // We cast the sum to a double to ensure a floating-point division
        return (double) sum / arr.length;
    }
}