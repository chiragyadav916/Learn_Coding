//Multithreading Problem //Synchronization
public class Video212 implements Runnable {
    int available = 1, passenger;

    Video212(int passenger) {
        this.passenger = passenger;
    }

    public synchronized void run() {
        System.out.println("Available Berth: " + available);
        if (available >= passenger) {
            String name = Thread.currentThread().getName();
            System.out.println(passenger + " Berth reserved for " + name);
            try {
                Thread.sleep(1500);
                available = available - passenger;
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        } else {
            System.out.println("Sorry, no berth available");
        }
    }
}

class D5 {
    public static void main(String[] args) {
        Video212 obj = new Video212(1);
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);
        Thread t3 = new Thread(obj);
        t1.setName("First Passenger");
        t2.setName("Second Passenger");
        t3.setName("Third Passenger");
        t1.start();
        t2.start();
        t3.start();
    }
}
