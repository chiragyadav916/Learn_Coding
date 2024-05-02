//Compare 2 Strings
public class Video122 {
    public static void main(String[] args) {
        String a="Chirag";
        //String b="Chirag";
        String b=new String("Chirag");

        if(a==b)
            System.out.println("True");
        else
            System.out.println("False");

        if (a.equals(b))
            System.out.println("True");
        else
            System.out.println("False");
    }
}
