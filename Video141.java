//Multi-level Inheritance
public class Video141 {//super
    int a, b, c;

    void add() {
        a = 10;
        b = 20;
        c = a + b;
        System.out.println("Sum= " + c);
    }

    void sub() {
        a = 200;
        b = 100;
        c = a - b;
        System.out.println("Sub= " + c);
    }
}

class B extends Video141 {//sub1

    void multi() {
        a = 10;
        b = 20;
        c = a * b;
        System.out.println("Multiplication= " + c);
    }

    void div() {
        a = 200;
        b = 100;
        c = a / b;
        System.out.println("Division= " + c);
    }
}

class C extends B {//sub2

    void rem() {
        a = 10;
        b = 3;
        c = a % b;
        System.out.println("Remainder= " + c);
    }

    public static void main(String[] args) {
        C r = new C();
        r.add();
        r.sub();
        r.multi();
        r.div();
        r.rem();
    }
}