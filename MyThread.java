public class MyThread implements Runnable {

    @Override
    public void run() {
        // The task the thread will perform
        for (int i = 0; i < 5; i++) {
            System.out.println("Message from " + Thread.currentThread().getName());
            try {
                // Pause the thread for 500 milliseconds
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // Handle the exception if the thread is interrupted
                System.out.println(Thread.currentThread().getName() + " was interrupted.");
                Thread.currentThread().interrupt(); // Restore the interrupted status
            }
        }
    }

    public static void main(String[] args) {
        // 3. Create three instances of MyThread
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        MyThread myThread3 = new MyThread();

        // 4. Create three Thread objects with the MyThread instances
        Thread thread1 = new Thread(myThread1, "Thread-1");
        Thread thread2 = new Thread(myThread2, "Thread-2");
        Thread thread3 = new Thread(myThread3, "Thread-3");

        // 5. Start all three threads
        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println("Main thread finished.");
    }
}