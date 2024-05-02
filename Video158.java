//extending interface
interface Video158 {//writing need of client

    void add();
}

interface A5 extends Video158 { //add+ sub
    void sub();
}

class B4 implements A5 {
    @Override
    public void add() {
        System.out.println("Addition!");
    }

    @Override
    public void sub() {
        System.out.println("Subtraction!");
    }

    public static void main(String[] args) {
        B4 r = new B4();
        r.add();
        r.sub();
    }
}
