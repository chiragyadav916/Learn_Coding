//Static vs Non-static Methods
public class Video117 {
    int a = 10;
    static int b = 20;

    public static void main(String[] args) {
        Video117 r = new Video117();
        Video117.Show();
        r.Display();
    }

    static void Show() {
        System.out.println(b);
    }

    void Display() {
        System.out.println(a + "  " + b);
    }
}
