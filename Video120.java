import java.util.Scanner;

//Factorial using Recursion
public class Video120 {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter Number: ");
        Scanner r = new Scanner(System.in);
        n = r.nextInt();
        Video120 obj = new Video120();
        int res = obj.fact(n);
        System.out.println("Factorial= " + res);
    }

    int fact(int n) {
        if (n == 1)
            return 1;
        else
            return n * fact(n - 1);  //Recursion
    }
}
