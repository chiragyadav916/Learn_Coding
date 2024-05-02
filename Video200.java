//Multi-threading by extending the Thread class

public class Video200 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running");//this is executed by the child thread
    }
}

class C3 {
    public static void main(String[] args) throws InterruptedException {
        Video200 t1 = new Video200();
        t1.start();
        System.out.println("Main Method!");//this is executed by the main thread
        Thread.sleep(1000);
    }
}
