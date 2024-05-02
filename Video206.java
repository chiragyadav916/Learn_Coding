//suspend() and resume() methods are deprecated in Java 1.2 and removed in Java 1.2
class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                sleep(500);
                System.out.println(Thread.currentThread().getId() + " Value " + i);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class Video206 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.suspend();
        t2.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.resume();
    }
}
