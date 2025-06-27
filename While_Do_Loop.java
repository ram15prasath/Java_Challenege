public class While_Do_Loop {
    public static void main(String[] args) {
        int n=5;

        int sum1=0;
        int sum2=0;
        //lets check what if conditions fails
        int i=6;
        int j=6;
        //Using While Loop
        while(i<=n){
            sum1 += i;
            i++;
        }
        System.out.println("Sum of Total:"+sum1);//Output is Zero 0 Because it exit when condition is fail...
        //Using Do While Loop
        do{
            sum2 += j;
            j++;
        }while(j<=n);
        System.out.println("Sum of Total:"+sum2);//Output is Six 6 Because it will run Statements One time before Condition fails...
    }
}

