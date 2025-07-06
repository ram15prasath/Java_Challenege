public class Polymorphisim {
    void display(){
        System.out.println("I am Programmer");
    }
    void display(int a){
        System.out.println(a);
    }
    void display(int a,int b){
        System.out.println(a+b);
    }
}
class sample2{
    public static void main(String[] args) {
        Polymorphisim obj1=new Polymorphisim();

        obj1.display();
        obj1.display(5);
        obj1.display(5,6);
    }
}