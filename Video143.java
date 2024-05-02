//Hierarchical Inheritance
public class Video143 {
    void input() {
        System.out.println("Enter Name: ");
    }
}

class B1 extends Video143 {
    void show() {
        System.out.println("Sunita Yadav!");
    }
}

class C1 extends Video143 {
    void display() {
        System.out.println("Chirag Yadav!");
    }

    public static void main(String[] args) {
        B1 b = new B1();
        C1 c = new C1();
        b.input();
        b.show();
        c.input();
        c.display();
    }
}
