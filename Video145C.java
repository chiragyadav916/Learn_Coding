//this keyword calling parameterized constructor
public class Video145C {
    Video145C() {
        this(7);//method
    }

    Video145C(int a) {
        System.out.println(a);
    }

    public static void main(String[] args) {
        Video145C r = new Video145C();

    }
}
