class Thread4 extends Thread{

    public void run() {
        System.out.println("Java");
        System.out.println("Python");
        System.out.println("C++");
    }
}
public class Threadsample4 {
    public static void main(String[] args) {
        Thread4 thread=new Thread4();

        thread.start();
    }
}
