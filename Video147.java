//method overloading, compile time polymorphism
public class Video147 {
    int A(int a) {
        System.out.println("A= " + a);
        return 0;
    }

    int A(int a, int b) {
        System.out.println("Sum= " + (a + b));
        return 0;
    }

    public static void main(String[] args) {
        Video147 r = new Video147();
        r.A(4);
        r.A(2, 4);
    }
}
