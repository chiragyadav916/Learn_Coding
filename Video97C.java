import java.util.Arrays;
import java.util.Scanner;

//copyOf()
public class Video97C {
    public static void main(String[] args) {
        int a1[] = new int[5];
        Scanner r = new Scanner(System.in);
        System.out.println("Enter Elements in Array 1: ");
        for (int i = 0; i < a1.length; i++) {
            a1[i] = r.nextInt();
        }
        int a2[] = Arrays.copyOf(a1, 6);
        a2[5] = 100;
        System.out.println("Array 2: ");
        for (int i = 0; i < a2.length; i++) {
            System.out.print(a2[i] + " ");
        }
    }
}
