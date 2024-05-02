//multiple catch blocks
public class Video174 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
//            arr[5] = 30 / 0;
            System.out.println(arr[8]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        } catch (Exception e) {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("rest of the code");
    }
}
