public abstract class Abstact_Classes {
    abstract void turnOn();
    abstract void turnOff();
}
class HP extends Abstact_Classes{
    @Override
    void turnOn() {
        System.out.println("Welcome to HP");
    }

    @Override
    void turnOff() {
        System.out.println("Turn Off");
    }
}
class Dell extends Abstact_Classes{
    @Override
    void turnOn() {
        System.out.println("Welcome to Dell");
    }

    @Override
    void turnOff() {
        System.out.println("Turn offed");
    }
}
class Computer{
    public static void main(String[] args) {
        HP obj1=new HP();
        obj1.turnOn();
        obj1.turnOff();

        Dell obj2=new Dell();
        obj2.turnOn();
        obj2.turnOff();
    }
}