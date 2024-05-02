import java.util.Arrays;
import java.util.Scanner;

//Sort()
public class Video97A {
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner r = new Scanner(System.in);
        System.out.println("Enter Elements: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt();
        }
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
