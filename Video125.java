//Console Class

import java.io.Console;

public class Video125 {
    public static void main(String[] args) {
        String str;
        char[] ch;
        Console obj = System.console();
        if (obj == null) {
            System.out.println("Console is not available. Make sure your program is run in a terminal.");
            return; // Exit the program if the console is not available.
        }
        System.out.println("Enter Username: ");
        str = obj.readLine();
        System.out.println("Enter Password: ");
        ch = obj.readPassword();
        String a = String.valueOf(ch);

        System.out.println("Username: " + str);
        System.out.println("Password: " + a);
        System.out.println("Password: " + ch);
    }
}
