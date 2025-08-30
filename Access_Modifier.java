public class Access_Modifier {
     private String name;//Using Private We can't access variable outside the class
    protected int rollno;//Protected can used in same package rather than other packages

    public void setValues(String n,int r){
        name=n;
        rollno=r;
    }
    public void display(){
        System.out.print(name+" ");
        System.out.println(rollno);
    }
}
class Main2{
    public static void main(String[] args) {
        Access_Modifier stu1=new Access_Modifier();
        Access_Modifier stu2=new Access_Modifier();

        stu1.setValues("Ramprasath",1027);//set Values Methods used when to access the Private Variables
        stu1.display();

        stu2.setValues("Madhan Raj",1018);
        stu2.display();
    }
}
