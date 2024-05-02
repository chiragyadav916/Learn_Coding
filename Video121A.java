//Strings on Java
//String Literals
public class Video121A {
    public static void main(String[] args) {
        String a = "Chirag"; //literal
        System.out.println(a);

        String b = "Chirag"; //literal
        System.out.println(b);

        //immutable
        //a.concat("Yadav");
        //System.out.println(a);
        a = a.concat("Yadav");
        System.out.println(a);
    }
}
