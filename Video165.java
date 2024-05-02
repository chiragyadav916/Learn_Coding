//Override annotation
public class Video165 {
    void show() {
        System.out.println("In A");
    }
}

class B7 extends Video165{
    @Override
    void show() {
        System.out.println("In B");
    }

    public static void main(String[] args) {
        B7 obj = new B7();
        obj.show();
    }
}
