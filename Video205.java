//join() method is used to pause the execution of the current thread until the specified thread is dead.
public class Video205 {
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
        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        t2.start();
        t3.start();
    }
}
