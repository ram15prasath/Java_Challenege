public class If_Statements {
     public static void main(String[] args) {
        char attendence='P';
        int total=40;
        if(attendence=='P'){
            if(total >=50){
                System.out.println("Able to Attend Classes");//Using Nested If
            }
            System.out.println(" Not able to Attended Classes");

        } else if (attendence=='O') {
            System.out.println("On-Duty");
        }
        else {
            System.out.println("Not Attended Classes");
        }
    }
    
}
