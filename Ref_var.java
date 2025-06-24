import java.awt.*;
import java.util.Date;
import java.util.*;
public class Ref_var{
    public static void main(String[] args) {
        Date today=new Date();
        System.out.println(today);

        Point p1=new Point(5,7);
        Point p2=p1;
        System.out.println(p2);
        p1.x=7;
        System.out.println(p1);
        System.out.println(p2);

    }
}
