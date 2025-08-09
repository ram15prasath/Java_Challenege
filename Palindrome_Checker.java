import java.util.*;


public class Palindrome_Checker {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String name=scan.nextLine();
        StringBuffer sb=new StringBuffer(name);
        sb.reverse();

        if (name.contains(sb)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}