//synchronized block
public class Video215 {
    public void show(String name) {
        ;//100 LOC
        synchronized (this) {
            for (int i = 1; i < 6; i++) {
                System.out.println(name);
            }
        }
        ;//100 LOC
    }
}

class ourThread extends Thread {
    String name;
    Video215 obj;

    ourThread(Video215 obj, String name) {//default constructor
        this.name = name;
        this.obj = obj;
    }

    public void run() {
        obj.show(name);
    }
}

class SynchronizedBlock {
    public static void main(String[] args) {
        Video215 obj = new Video215();//obj has 1 lock
        ourThread t1 = new ourThread(obj, "First Thread");
        ourThread t2 = new ourThread(obj, "Second Thread");
        t1.start();
        t2.start();
    }
}
