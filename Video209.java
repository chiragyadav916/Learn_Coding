//isAlive() method is used to check whether the thread is alive or not.
public class Video209 {
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
        System.out.println(t1.isAlive());
        t1.start();
        t2.start();
        t3.start();
        System.out.println(t2.isAlive());
        System.out.println(t3.isAlive());
    }
}
