import java.util.Scanner;
class Scanner{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        String b=scan.nextLine();
        float c=scan.nextFloat();
        char d=scan.next().charAt(0);
        System.out.println(a+b+c+d);

    }
}