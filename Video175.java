//nested try block
public class Video175 {
    public static void main(String[] args) {
        try {
            try {
                System.out.println("inside the inner try block- start");
                int b = 39 / 0;
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
            System.out.println("inside the inner try block- end");
        } catch (Exception e) {
            System.out.println("outer try block");
        }
        System.out.println("normal flow");
    }
}
