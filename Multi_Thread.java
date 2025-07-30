class Cake extends Thread{
    public void run(){
        System.out.println("Mixing Ingredients"+Thread.currentThread().getId());
        System.out.println("Baking Cake"+Thread.currentThread().getId());
        System.out.println("Decorating Cake"+Thread.currentThread().getId());
    }
}
public class Multi_Thread {
    public static void main(String[] args) {
        int cakeCout=5;
        for (int i=0;i<cakeCout;i++){
            Cake cake=new Cake();
            cake.start();
        }
    }
}
