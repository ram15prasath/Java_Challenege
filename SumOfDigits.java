public class SumOfDigits {
    public static void main(String[] args) {
        int arr[]={10,20,30};
        int fact=0;
        for (int i = 0; i < arr.length; i++) {
            fact +=arr[i];
        }
        System.out.println(fact);
    }
}
