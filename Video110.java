import java.util.Scanner;

//Fibonacci Series
public class Video110 {
    public static void main(String[] args) {
        int term, a = 0, b = 1, c;
        System.out.println("Enter Number: ");
        Scanner r = new Scanner(System.in);
        term = r.nextInt();
        for (int i = 1; i <= term; i++) {
            System.out.print(a + ", ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
