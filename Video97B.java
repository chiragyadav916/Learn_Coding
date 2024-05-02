import java.util.Arrays;
import java.util.Scanner;

//Equals()
public class Video97B {
    public static void main(String[] args) {
        int a1[] = new int[5];
        int a2[] = new int[5];
        Scanner r = new Scanner(System.in);
        System.out.println("Enter Elements in Array 1: ");
        for (int i = 0; i < a1.length; i++) {
            a1[i] = r.nextInt();
        }
        System.out.println("Enter Elements in Array 2: ");
        for (int i = 0; i < a2.length; i++) {
            a2[i] = r.nextInt();
        }
        boolean b = Arrays.equals(a1, a2);
        System.out.print(b);
    }
}
