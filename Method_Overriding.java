public class Method_Overriding {
    public void display(){
        System.out.println("I am the Method Overriding class");
    }
}
class Sample4{
    public void display(){
        System.out.println("I am in Sample4 class");
    }
}
class sample5{
    public static void main(String[] args) {
        Sample4 obj1=new Sample4();
        obj1.display();
    }
}
