//this keyword calling default constructor
public class Video145B {
    Video145B() {
        System.out.println("Sunita Yadav");
    }

    Video145B(int a) {
        this();//method
        System.out.println(a);
    }

    public static void main(String[] args) {
        Video145B r = new Video145B(7);
    }
}
