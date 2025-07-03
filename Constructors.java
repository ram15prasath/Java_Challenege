public class Constructors {
     int mark;
    int rollno;

    Constructors(int m,int r){
        mark=m;
        rollno=r;
    }
}
 class Sample11{
     public static void main(String[] args) {
         Constructors obj=new Constructors(76,654);
         System.out.println(obj.mark);
         System.out.println(obj.rollno);
     }
    
}
