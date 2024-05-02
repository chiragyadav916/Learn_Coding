//method level synchronization
public class Video214 {
    public synchronized void printTable(int n) {//t1 and t2 will have to wait for each other
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
        }
    }
}

class Thread1 extends Thread {
    Video214 t;

    Thread1(Video214 t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
}

class Thread2 extends Thread {
    Video214 t;

    Thread2(Video214 t) {
        this.t = t;
    }

    public void run() {
        t.printTable(9);
    }
}

class D6 {
    public static void main(String[] args) {
        Video214 obj = new Video214();//obj = 1 lock
        Thread1 t1 = new Thread1(obj);
        Thread2 t2 = new Thread2(obj);
        t1.start();
        t2.start();
    }
}