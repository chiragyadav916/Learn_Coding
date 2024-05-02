import java.util.Scanner;

//Swapping of 2 Numbers without Third variable
public class Video68 {
    public static void main(String[] args) {
        int a, b;
        System.out.print("Enter 2 Numbers: ");
        Scanner ref = new Scanner(System.in);
        a = ref.nextInt();
        b = ref.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swapping: " + a + " " + b);
    }
}
