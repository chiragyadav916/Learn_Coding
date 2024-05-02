//Print Character in JAVA

import java.util.Scanner;

public class Video49 {
    public static void main(String[] args) {
        char ch;
        System.out.print("Enter Character: ");
        Scanner r = new Scanner(System.in);
        ch = r.next().charAt(0);
        System.out.println("Character: " + ch);
    }
}
