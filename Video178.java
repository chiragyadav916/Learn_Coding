//try-catch finally block inside finally block
public class Video178 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            System.out.println(arr[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException1");
        } finally {
            try {
                int[] arr = new int[5];
                System.out.println(arr[6]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException2");
            } finally {
                System.out.println("Finally block inside finally block");
            }
        }
    }
}
