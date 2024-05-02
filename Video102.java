import java.util.Scanner;

//Delete Element in an Array
public class Video102 {
    public static void main(String[] args) {
        int size, loc, i;
        Scanner r = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        size = r.nextInt();

        int a[] = new int[size];
        System.out.println("Enter Array Elements: ");
        for (i = 0; i < size; i++)
            a[i] = r.nextInt();

        System.out.println("Enter Array Location: ");
        loc = r.nextInt();

        for (i = loc; i < size - 1; i++)
            a[i] = a[i + 1];

        --size;
        for (i = 0; i < size; i++)
            System.out.print(a[i] + " ");
    }
}
