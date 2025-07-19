public class Excep_2 {
    public static void main(String[] args) {
        try {
            int arr[]={1,2,3,4,5,6};
            System.out.println(arr[6]);
        }catch (ArrayIndexOutOfBoundsException E){
            System.out.println(E.getMessage());
        }
    }
}
