class SampleThread5 extends Thread{

    public void run() {
        int a=10;
        for (int i = 0; i < a; i++) {
            System.out.println(i);
        }
        String arr[]={"a","b","c","d","f"};
        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr);
        }

    }
}




public class Thread7 {
    public static void main(String[] args) {
        SampleThread5 thread =new SampleThread5();
        thread.start();
    }
}
