//var-arg method
public class Video167 {
    void show(int...a) {
        for (int i : a) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Video167 obj = new Video167();
        obj.show(1);
        obj.show(1, 2);
        obj.show(1, 2, 3);
    }
}
