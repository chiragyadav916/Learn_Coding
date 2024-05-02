//Constructor Overloading
public class Video135 {
    int a;
    double b;
    String c;

    Video135() { //default
        a = 10;
        b = 1.11;
        c = "Ram Ram";
    }

    Video135(int x) {  //parameterized
        a = x;
    }

    Video135(double y, String z) {  //parameterized
        b = y;
        c = z;
    }
}

class Video135a {
    public static void main(String[] args) {
        Video135 r = new Video135();
        Video135 r2 = new Video135(10);
        Video135 r3 = new Video135(1.1, "Ram");
        System.out.println(r.a + "  " + r.b + "  " + r.c);
        System.out.println(r2.a);
        System.out.println(r3.b + "  " + r3.c);
    }
}
