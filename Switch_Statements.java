public class Switch_Statements {
        public static void main(String[] args) {
        char attendence='C';

        switch (attendence){
            case 'P':
                System.out.println("Attended Classes");
                break;
            case 'O':
                System.out.println("On-Duty");
                break;
            case 'A':
                System.out.println("Not Attended Classes");
                break;
            default:
                System.out.println("404 ERROR");
        }
    }
}
