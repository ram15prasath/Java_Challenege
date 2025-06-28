public class Jump_Statements {
     public static void main(String[] args) {
        //Using Break
        System.out.println("===========Break===========");
        for(int i=1;i<=10;i++){
            if(i==5){
                break;
            }
            System.out.println(i);//Terminates When Condition Meets
        }
        //using Continue
        System.out.println("===========Continue===========");
        for(int j=1;j<=10;j++){
            if(j==5){
                continue;
            }
            System.out.println(j);//Skips Entire Program Down and redirect to Loop after condition Meets..
        }
    }
}
