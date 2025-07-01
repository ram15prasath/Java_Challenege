public class Class_Objects {
     String name;
    int rollno;

    public void setValues(String n,int r){
        name=n;
        rollno=r;
    }
    public void display(){
        System.out.println(name);
        System.out.println(rollno);
    }
}
class Main1{
    public static void main(String[] args) {
        Class_Objects stu1=new Class_Objects();
        Class_Objects stu2=new Class_Objects();

        stu1.setValues("Ramprasath",1027);
        stu1.display();

        stu2.setValues("Madhan Raj",1018);
        stu2.display();
    }

    
}
