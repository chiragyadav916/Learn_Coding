//interface default method (JDK 1.8)
interface Video159 {
    void a1();//public+ abstract

    void a2();//public+ abstract

//    void  a3();//public+ abstract
    default void  a3(){//default
        System.out.println("Ram Ram!");
    }
}

class A6 implements Video159 {
    @Override
    public void a1() {
        System.out.println("Sunita Yadav!");
    }

    @Override
    public void a2() {
        System.out.println("Chirag Yadav!");
    }

    @Override
    public void a3() {
        System.out.println("A6 a3()");
    }
}

class B5 implements Video159 {
    @Override
    public void a1() {
        System.out.println("Sunita!");
    }

    @Override
    public void a2() {
        System.out.println("Chirag!");
    }

    public static void main(String[] args) {
        A6 r = new A6();
        r.a1();
        r.a2();
        B5 r1 = new B5();
        r1.a1();
        r1.a2();

        r.a3();
        r1.a3();
    }
}