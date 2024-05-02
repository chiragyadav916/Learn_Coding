//Relational Operators

import java.util.Scanner;

public class Video22 {
    public static void main(String args[]) {
        int a, b;
        System.out.print("Enter 2 Numbers: ");
        Scanner obj = new Scanner(System.in);
        a = obj.nextInt();
        b = obj.nextInt();
        System.out.println("True/False!!");
        System.out.println("a<b " + (a < b));
        System.out.println("a>b " + (a > b));
        System.out.println("a<=b " + (a <= b));
        System.out.println("a>=b " + (a >= b));
        System.out.println("a==b " + (a == b));
        System.out.println("a!=b " + (a != b));
    }
}
