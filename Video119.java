//Recursion in Java
public class Video119 {
    public static void main(String[] args) {
        Video119 r = new Video119();
        int a = r.sum(3); //Calling
        System.out.println("Sum= " + a);
    }

    int sum(int b) {
        if (b > 0) {
            return b + sum(b - 1); //Calling
        } else {
            return 0;
        }
    }
}
