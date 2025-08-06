class Thread5 extends Thread{
    public int square(int a){

       int b=a*a;
       System.out.println(b);
       return b;

    }
    public void run() {

        square(5);

    }
}




public class Threadsample5 {
    public static void main(String[] args) {
        Thread5 thread=new Thread5();
        thread.start();

    }
}
