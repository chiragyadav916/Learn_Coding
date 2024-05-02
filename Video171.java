//try catch finally block
public class Video171 {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
            System.out.println("Try Block");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally Block");
        }
        System.out.println("Rest of the code");
    }
}
