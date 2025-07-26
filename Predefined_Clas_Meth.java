public class Predefined_Clas_Meth {
    public static void main(String[] args) {
        //to String
        String a=Integer.toString(55);
        System.out.println(a);
        //to Binary
        String b=Integer.toBinaryString(55);
        System.out.println(b);
        //value Of
        int c=Integer.valueOf(b);
        System.out.println(c);
        //Parse int
        int d=Integer.parseInt(a);
        System.out.println(d);
        System.out.println("=================String Classes===============");
        //String Predefined Classes
        String name="Aruthor Morgon";
        System.out.println(name.equals("Dutch"));
        System.out.println(name.equals("Aruthor Morgon"));
        System.out.println(name.length());
        System.out.println(name.charAt(5));


    }
}
