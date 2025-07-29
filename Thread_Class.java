public class Thread_Class extends Thread {
    public static void main(String[] args) {
        Thread thr1=new Thread("Hello");
        Thread thr2=new Thread("Java");

        thr1.run();
        thr2.run();
    }
}
