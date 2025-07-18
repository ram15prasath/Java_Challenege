import java.util.*;
public class Excep_Sample {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);


        try{
            int a=scan.nextInt();
            int b=scan.nextInt();
            int c=a/b;
            System.out.println(c);
        }catch (InputMismatchException E){
            System.out.println("Enter Integer");
        }catch (ArithmeticException E){
            System.out.println(E.getMessage());
        }finally {
            System.out.println("Excuted");
        }
    }
}
