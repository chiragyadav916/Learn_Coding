//throw vs throws
public class Video184 {
    void division(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Divide by zero");
        } else {
            System.out.println(a / b);
        }
    }

    // we can also use throws keyword in main method
    //use try catch block to handle the exception thrown by division method
    public static void main(String[] args) {
        Video184 obj = new Video184();
        try {
            obj.division(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught");
        }
    }
}
