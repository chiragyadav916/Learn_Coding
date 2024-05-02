import java.util.Scanner;

//new keyword
public class Video163 {
    int a = 10;

    Video163() {
        System.out.println(a);
    }

    public static void main(String[] args) {
        Video163 r = new Video163();
//        System.out.println(a);//non-static variable a cannot be referenced from a static context
        System.out.println(r.a);

        int size;
        System.out.println("Enter Size: ");
        Scanner r1 = new Scanner(System.in);
        size = r1.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter Element(s): ");
        for (
                int i = 0;
                i < size; i++) {
            arr[i] = r1.nextInt();
        }
        System.out.println("Element(s): ");
        for (
                int m : arr) {
            System.out.println(m + ", ");
        }
    }
}
