public class Rel_log_opers {
    public static void main(String[] args) {
        int a=10;
        int b=10;
        //Relational Operations
        System.out.println("========Relational Operators=====");
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println("========Logical Operators=====");
        boolean c=true;
        boolean d=false;
        //Logical Operations
        System.out.println(c && d);
        System.out.println(c || d);
        System.out.println(!c);
        System.out.println(!d);
        System.out.println("========Precedence Operators=====");
        int e=10;
        int f=5;
        int g=e*f+e;//first calculate e and f add e
        int h=e+f*e;//Using precedence concept f and e multiply add to first e
        System.out.println(g);
        System.out.println(h);

    }
}
