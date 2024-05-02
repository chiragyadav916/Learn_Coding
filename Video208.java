//stop() method is deprecated in Java 11
public class Video208 {
    public static void main(String[] args) {
        Video202 obj1 = new Video202();
        Video202 obj2 = new Video202();
        Video202 obj3 = new Video202();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        Thread t3 = new Thread(obj3);

        t1.setName("First Thread");
        t2.setName("Second Thread");
        t3.setName("Third Thread");

        t1.start();
        t2.start();
        t3.start();
        t1.stop();
        t2.stop();
        t3.stop();
    }
}
