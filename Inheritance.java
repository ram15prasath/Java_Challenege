public class Inheritance {
    public void walk(){
        System.out.println("I can Walk");
    }
    public void sleep(){
        System.out.println("I can Sleep");
    }
}
class Dog extends Inheritance{
    public void bark(){
        System.out.println("I can Bark");
    }
}
class Cat extends Inheritance{
    public void meow(){
        System.out.println("I can Meoww");
    }
}
class Main5{
    public static void main(String[] args) {
        Dog obj1=new Dog();
        obj1.walk();
        obj1.sleep();
        obj1.bark();

        Cat obj2=new Cat();
        obj2.walk();
        obj2.sleep();
        obj2.meow();
    }
}
