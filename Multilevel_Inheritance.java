public class Multilevel_Inheritance {
    public static void main(String[] args) {
        BabyDog obj2=new BabyDog();
        obj2.print();
        obj2.printt();
        obj2.display();
    }
}
class Animal{
    void print(){
        System.out.println("I am Walking");
    }
}
class Dogs extends Animal{
    void printt(){
        System.out.println("I am Barking");
    }
}
class BabyDog extends Dogs{
    void display(){
        System.out.println("I am also Bark");
    }
}