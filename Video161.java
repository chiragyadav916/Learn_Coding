//Interface private method
interface Video161 {
//     Method one to implement private method outside interface
//    default void call() {
//        add(10, 20);
//    }

    //method two
    public static void call() {
        add(10, 30);
    }

    //    private void add(int a, int b) {
    private static void add(int a, int b) {
        System.out.println("Sum= " + (a + b));
    }
}

class B6 implements Video161 {
    public void sub(int a, int b) {
        System.out.println("Sub= " + (a - b));
    }

    public static void main(String[] args) {
        B6 r = new B6();
        r.sub(5, 1);
//        r.add(2, 5);//we can't call private method outside interface

//        r.call();//default call
        Video161.call();//static call
    }
}
