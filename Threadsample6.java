class Thread6 extends Thread{

    public void run() {
        int a=10;
        for (int i = 0; i < a; i++) {
            a *=i;
            System.out.println(a);
        }
    }
}



public class Threadsample6 {
    public static void main(String[] args) {
        Thread6 thread=new Thread6();

        thread.start();
    }
}
