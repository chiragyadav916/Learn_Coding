//Multi-threading by implementing the Runnable interface
public class Video201 implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running");//this is executed by the child thread
    }
}

class D {
    public static void main(String[] args) {
        Video201 obj = new Video201();
        Thread t1 = new Thread(obj);
        t1.start();
        System.out.println("Main Method!");//this is executed by the main thread
    }
}
