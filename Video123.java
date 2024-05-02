//Pre-defined String Methods
public class Video123 {
    public static void main(String[] args) {
        String a = "Chirag";
        String b = "Yadav";

        System.out.println(a.toLowerCase());
        System.out.println(b.toUpperCase());

        System.out.println(b.concat(a));
        System.out.println(a.length());

        String c = "     YADAV      ";
        String d = "";
        System.out.println(c.trim());
        System.out.println(d.isEmpty());

        System.out.println(b.charAt(3));
        System.out.println(a.indexOf('r'));

        System.out.println(b.equals(a));
        System.out.println(a.replace('C', 'c'));
    }
}
