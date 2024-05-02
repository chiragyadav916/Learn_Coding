//Method overriding, run time polymorphism
public class Video148 {
    void draw() {
        System.out.println("Can't Say");
    }
}

class B3 extends Video148 {
    @Override
    void draw() {
        System.out.println("Sunita Yadav!");
    }

    public static void main(String[] args) {
        Video148 r = new B3();
        r.draw();
    }
}
