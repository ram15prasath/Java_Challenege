public class Excep_3 {
    public static void main(String[] args) {
        try {
            int a;
            Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

    }
}
