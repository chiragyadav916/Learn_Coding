import java.util.Arrays;

//toString(), asList() & deepToString()
public class Video88 {
    public static void main(String[] args) {
        String[] a = {"Chirag", "Yadav", "Tanvi", "Yadav"};
        System.out.println("toString() " + Arrays.toString(a));
        System.out.println("asList() " + Arrays.asList(a));

        int arr[][] = {{10, 20}, {30, 40}};
        System.out.println("deepToString() " + Arrays.deepToString(arr));
    }
}
