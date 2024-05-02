//multiple try catch block
public class Video173 {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
            System.out.println("Try Block");
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println(e);
        }
        try {
            int[] arr = new int[5];
            System.out.println(arr[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
