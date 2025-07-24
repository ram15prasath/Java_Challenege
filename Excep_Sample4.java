public class Excep_Sample4 {
    public static void main(String[] args) {
        String name="Java";
        try {
            System.out.println(name.substring(6));
        }catch (StringIndexOutOfBoundsException E){
            System.out.println(E.getMessage());
        }
    }
}
