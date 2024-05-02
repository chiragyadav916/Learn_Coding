//exception handling
public class Video168 {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
            System.out.println("Try Block");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

