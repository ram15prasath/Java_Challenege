import java.util.*;
public class Excep_Sample2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        try {
            int a=scan.nextInt();
            int b= scan.nextInt();
            int c=a+b;
        }catch (InputMismatchException E){
            System.out.println("Enter a integer value");
        }
    }
}

