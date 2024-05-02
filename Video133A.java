//copy constructor
public class Video133A {
    int a;
    String b;

    Video133A() {
        a = 10;
        b = "Chirag Yadav";
        System.out.println(a + "  " + b);
    }

    Video133A(Video133A ref)//copy constructor
    {
        a = ref.a;
        b = ref.b;
        System.out.println(a + "  " + b);
    }
}

class Video133aa {
    public static void main(String[] args) {
        Video133A r = new Video133A();
        Video133A ref = new Video133A(r);
    }
}
