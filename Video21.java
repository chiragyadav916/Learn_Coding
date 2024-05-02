//Arithmetic Operators

import java.util.Scanner;

public class Video21 {
    public static void main(String args[]) {
        int a, b;
        System.out.print("Enter Datas: ");
        Scanner obj = new Scanner(System.in);
        a = obj.nextInt();
        b = obj.nextInt();
        System.out.println("Addition " + (a + b));
        System.out.println("Subtraction " + (a - b));
        System.out.println("Multiplication " + (a * b));
        System.out.println("Division " + (a / b));
        System.out.println("Remainder " + (a % b));
    }
}
