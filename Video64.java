import java.util.Scanner;

//Area of a Circle
public class Video64 {
    public static void main(String[] args) {
        final double PI = 3.14;
        int r;
        System.out.println("Enter Radius: ");
        Scanner ref = new Scanner(System.in);
        r = ref.nextInt();

        double area = PI * r * r;
        System.out.println("Area= " + area);
    }
}
