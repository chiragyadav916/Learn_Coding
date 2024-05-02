//copy constructor
public class Video133B {
    int a;
    String b;

    Video133B(int x, String y)//parameterized
    {
        a = x;
        b = y;
        System.out.println(x + "  " + y);
    }

    Video133B(Video133B ref)//copy
    {
        a = ref.a;
        b = ref.b;
        System.out.println(a + "  " + b);
    }
}

class Video133bb {
    public static void main(String[] args) {
        Video133B ref = new Video133B(10, "Chirag");
        Video133B r = new Video133B(ref);
    }
}
