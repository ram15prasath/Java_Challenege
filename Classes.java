public class Classes {
    String name;
    int rollno;
    public void display(){
        System.out.println(name);
        System.out.println(rollno);
    }

    public static void main(String[] args) {
        Classes st1=new Classes();
        Classes st2=new Classes();

        st1.name="Ramprasath";
        st1.rollno=1027;
        st1.display();

        st2.name="Vijay Raj";
        st2.rollno=1034;
        st2.display();
    }
}
