//super keyword
public class Video144 {
    int a = 10;

    void disp() {
        System.out.println(a);
    }
}

class B2 extends Video144 {
    int a = 20;

    void disp() {
        super.disp();
        System.out.println(super.a);
    }

    public static void main(String[] args) {
        B2 b = new B2();
        b.disp();
    }
}
