//parameterized Constructor
public class Video132 {
    int x, y;

    Video132(int a, int b)//parameterized constructor
    {
        x = a;
        y = b;
    }

    Video132(int a, String b)//parameterized constructor
    {
        System.out.println(a + "  " + b);
    }

    void show() {
        System.out.println(x + "  " + y);
    }
}

class Video132a {
    public static void main(String[] args) {
        Video132 r = new Video132(100, 200);
        r.show();
        Video132 ref = new Video132(10, "Jay Shree Ram!!");
    }
}
