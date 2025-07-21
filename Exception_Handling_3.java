class UserDefined extends Exception{
    UserDefined(String str){
        super(str);
    }
}
public class Exception_Handling_3 {
    static void check(int age) throws UserDefined, ArithmeticException {
        if (age <= 18) {
            throw new UserDefined("Invalid");

        } else {
            throw new ArithmeticException("Valid");
        }
    }

    public static void main(String[] args) {
        int a=5;
        try {
            check(17);
        }catch (UserDefined E){
            System.out.println(E.getMessage());
        } catch (ArithmeticException E) {
            System.out.println(E.getMessage());
        }
    }
}

