//static synchronization
public class Video216 {
    public static synchronized void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
        }
    }
}

class Thread_1 extends Thread {
    public void run() {
        Video216.printTable(5);
    }
}

class Thread_2 extends Thread {
    public void run() {
        Video216.printTable(9);
    }
}

class D2 {
    public static void main(String[] args) {
        Thread_1 t1 = new Thread_1();
        Thread_2 t2 = new Thread_2();
        t1.start();
        t2.start();
    }
}