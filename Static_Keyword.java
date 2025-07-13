public class Static_Keyword {
    public static void main(String[] args) {
        Father2.print();
        System.out.println(Father2.age);

        Daghuter2.prints();
        System.out.println(Daghuter2.age);
    }
}
class Father2{
    static int age=50;
    static void print(){
        System.out.println("Father");
    }
}
class Daghuter2 extends Father{
    static int age=20;
    static void prints(){
        System.out.println("Daghter");
    }
}