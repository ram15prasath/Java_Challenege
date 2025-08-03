class Thread2 extends Thread{
    public void run() {
        String name="Joel Miller";
        for (int i = 0; i < 3; i++) {
            System.out.println(name);
        }

    }
}

public class Threadsaample2 {
    public static void main(String[] args) {
        Thread2 thread=new Thread2();

        thread.start();
    }
}
