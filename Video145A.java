//this keyword
public class Video145A {
    int a = 100;

    Video145A(int a) {
//        a=a;
        this.a = a;
    }

    void show() {
        System.out.println(a);
        System.out.println(this);
    }

    public static void main(String[] args) {
        Video145A r = new Video145A(916);
        System.out.println(r);
        r.show();
    }
}
