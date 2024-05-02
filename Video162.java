//final keyword
public class Video162 {
//    final int A = 10;//java: non-static variable A cannot be referenced from a static context

    void mNumber() {
        System.out.println("41691690");
    }

    public static void main(String[] args) {
        final int A = 10;
        System.out.println(A);
//        A=10;//java: cannot assign a value to final variable A

//        A8 r = new A8();
//        r.mNumber();
    }
}
//
//class A8 extends Video162 {
//    @Override
//    void mNumber() {//mNumber() in A7 cannot override mNumber() in Video162
////        overridden method is final
//        System.out.println("final method!");
//    }
//}