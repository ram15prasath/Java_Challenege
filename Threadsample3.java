class Thread3 extends Thread{
    public void run() {
        int a=0;

        for (int i = 0; i < 10; i++) {
            System.out.println(a*a);
        }

    }
}

public class Threadsample3 {
    public static void main(String[] args) {
        Thread3 thread =new Thread3();

        thread.start();
        try {
            thread.join();
        }catch (Exception E){
            System.out.println(E.getMessage());
        }
    }
}
