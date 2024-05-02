//String Reverse
public class Video124 {
    public static void main(String[] args) {
        StringBuffer r = new StringBuffer("Chirag Yadav");
        System.out.println(r.reverse());

        StringBuilder ref = new StringBuilder("Yadav Chirag");
        System.out.println(ref.reverse());

        String a = "Chirag";
        String a2 = "";
        int l = a.length();
        for (int i = l - 1; i >= 0; i--) {
            a2 += a.charAt(i);
        }
        System.out.println(a2);
    }
}
