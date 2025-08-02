class Thread1 extends Thread{
    public void run() {
        int a;
        for(int i=0;i<10;i++){
            a=+i;
            System.out.println(a);
        }
    }

}

public class Threadsample{
    public static void main(String[] args) {
        Thread1 thread=new Thread1();

        thread.start();
        try {
            thread.wait(1);
        }catch (Exception E){
            System.out.println(E.getMessage());
        }
    }

}
