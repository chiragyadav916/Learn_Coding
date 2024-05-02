//exception propagation
public class Video187 {
    public static void main(String[] args) {
        try {
            m1();
        } catch (Exception e) {
            System.out.println("Exception handled in main method");
        }
    }

    static void m1() {
        m2();
    }

    static void m2() {
        m3();
    }

    static void m3() {
        m4();
    }

    static void m4() {
        System.out.println(10 / 0);
    }
}
