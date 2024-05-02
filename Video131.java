//default constructor
public class Video131 {
    int a;
    String b;
    boolean c;

    Video131()//default constructor
    {
        a = 100;
        b = "Chirag";
        c = false;
    }

    void display() {
        System.out.println(a + "  " + b + "  " + c);
    }
}

class Video131a {
    public static void main(String[] args) {
        Video131 r = new Video131();
        r.display();
    }
}
