class Cake1 implements Runnable{
    public void run(){
        System.out.println("Mixing Ingredients"+Thread.currentThread().getId());
        System.out.println("Baking Cake"+Thread.currentThread().getId());
        System.out.println("Decorating Cake"+Thread.currentThread().getId());
    }
}
public class Runnable_Interface {
    public static void main(String[] args) {
        for (int i=0;i<5;i++){
            Cake1 cake1=new Cake1();
            Thread thread =new Thread(cake1);
            thread.start();
        }


    }
}