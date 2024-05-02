//encapsulation
public class Video149 {
    private int value;//data hiding

    public void setValue(int a) {//data abstraction
        value = a;
    }

    public int getValue() {
        return value;
    }
}

class A {
    public static void main(String[] args) {
        Video149 r = new Video149();
        r.setValue(916);
        System.out.println(r.getValue());
    }
}
