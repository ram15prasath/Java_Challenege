public class Excep_Sample_5 {
    public static void main(String[] args) {
        String name=null;
        try{
            System.out.println(name.length());
        }catch (NullPointerException E){
            System.out.println(E.getMessage());
        }
    }
}
