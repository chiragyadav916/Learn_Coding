//try catch block inside try block
public class Video176 {
    public static void main(String[] args) {
        try {
            System.out.println("outer try block- start");
        } catch (Exception e) {
            try {
                System.out.println("inner try block- start");
                int b = 39 / 0;
            } catch (ArithmeticException a) {

                System.out.println(a);
            }
            System.out.println("outer catch block");
        }
        System.out.println("normal flow");
    }
}
