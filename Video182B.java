//throws (better approach)- try-catch block
public class Video182B {
    public static void main(String[] args) {
        try {
            throw new ArithmeticException("This is an exception");
        } catch (ArithmeticException e) {
            System.out.println("Exception caught");
        }
    }
}
