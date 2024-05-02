//Method
public class Video116 {

    public static void Radhey() {
        System.out.println("Radhey Radhey!!");
    }

    public static void main(String[] args) {
        Video116 r = new Video116();
        r.Display(); //non-static method
        Video116.Radhey(); //static method
    }

    void Display() {
        System.out.println("Jai Shree Ram!!");
    }
}
