import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a= scan.nextInt();
        int b=scan.nextInt();
        String symbol=scan.next();
        switch (symbol){
            case "+":
                    System.out.println(a+b);
                    break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                System.out.println(a/b);
                break;

        }

    }
}
