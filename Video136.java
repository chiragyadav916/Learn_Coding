//Instance Block
public class Video136 {
    int a, b;

    static void display() {
        System.out.println("Jay Shree Ram!!");
    }

    void show() {
        a = 50;
        b = 60;
        System.out.println(a + "  " + b);
    }

    Video136() {
        a = 30;
        b = 40;
        System.out.println(a + "  " + b);
    }

    { //instance block
        a = 10;
        b = 20;
        System.out.println(a + "  " + b);
    }
}

class Video136a {
    public static void main(String[] args) {
        Video136.display();  //static method
        Video136 r = new Video136();
        r.show();
    }
}
