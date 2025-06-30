public class Recursion_Method {
     public static void main(String[] args) {
        natrualPrint(10);

    }
    public static void natrualPrint(int n){
        if(n==1){
            System.out.println(1);
        }
        else {
            System.out.println(n);
            natrualPrint(n-1);
        }
    }
}
