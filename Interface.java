interface Faather{
    abstract void talk();
}
interface Moother{
    abstract void call();
}
public class Interface implements Faather,Moother {
    public void talk(){
        System.out.println("Talking");
    }
    public void call(){
        System.out.println("Calling");
    }

    public static void main(String[] args) {
        Interface obj=new Interface();
        obj.talk();
        obj.call();
    }
}
