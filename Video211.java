//setPriority() and getPriority() methods in Thread class in Java
public class Video211 {
    public static void main(String[] args) {
        D4 t1 = new D4();
        D4 t2 = new D4();
        D4 t3 = new D4();

        t1.setName("First Thread");
        t2.setName("Second Thread");
        t3.setName("Third Thread");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
class D4 extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running with priority " + Thread.currentThread().getPriority());
    }
}

