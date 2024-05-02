import java.util.Scanner;

//Find Array Length
public class Video90 {
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner r = new Scanner(System.in);
        System.out.println("Enter Elements: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt();
        }
        System.out.println("Printed Element: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\nArray Length: " + a.length);
    }
}

