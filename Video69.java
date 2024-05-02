import java.util.Scanner;

//Convert LowerCase Character to UpperCase Character & vice-versa
public class Video69 {
    public static void main(String[] args) {
        char ch, ch1;
        System.out.print("Enter Any Character: ");
        Scanner r = new Scanner(System.in);
        ch = r.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            ch1 = Character.toLowerCase(ch);
            System.out.print(ch1);
        } else {
            ch1 = Character.toUpperCase(ch);
            System.out.print(ch1);
        }
    }
}
