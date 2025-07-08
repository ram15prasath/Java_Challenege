public class Single_Inheritance {
    public static void main(String[] args) {
        Son obj1=new Son();
        obj1.print();
        obj1.printt();
    }
}
class Father{
    void print(){
        System.out.println("I am Father Class");
    }
}
class Son extends Father{
    void printt(){
        System.out.println("I am Son Class");
    }
}