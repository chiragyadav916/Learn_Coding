//sleep() method is used to pause the execution of the current thread for a specified period of time.
public class Video204 implements Runnable {
    public void run() {
        String st = Thread.currentThread().getName();
        for (int i = 0; i < 5; i++) {
            System.out.println(st + " is running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        Video204 obj = new Video204();
        Thread t1 = new Thread(obj);
        t1.start();
    }
}
