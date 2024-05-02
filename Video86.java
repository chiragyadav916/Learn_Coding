//Array

import java.util.Scanner;

public class Video86 {
    public static void main(String[] args) {
        int s;
        Scanner r = new Scanner(System.in);
        System.out.println("Enter Size: ");
        s = r.nextInt();
        int a[] = new int[s];
        for (int i = 0; i < s; i++) {
            a[i] = r.nextInt();
        }
        System.out.println("Printed Element: ");
        for (int i = 0; i < s; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
