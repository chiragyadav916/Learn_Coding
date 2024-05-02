//yield() method is used to pause the execution of the current thread and give the chance to the threads of the same priority.
public class Video207 implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            // yields control to another thread every iteration
            Thread.yield();
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        Video207 obj = new Video207();
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);
        t1.setName("First Thread");
        t2.setName("Second Thread");
        t1.start();
        t2.start();
    }
}
