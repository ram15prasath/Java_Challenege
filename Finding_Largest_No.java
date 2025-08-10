public class Finding_Largest_No {
       public static void main(String[] args) {
        int arr[] = {1, 0, 3, 4, 3};
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest=arr[i];
            }
        }
        System.out.println(largest);
    } 
}
