public class Exception_Handling {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        try{
            System.out.println(a/b);
        } catch (Exception e) {
            System.out.println("B is 0");
        }
    }
}
