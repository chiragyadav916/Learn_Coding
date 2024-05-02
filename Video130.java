//Constructor
public class Video130 {
    int a;
    String name;

    /*
    Video130(){   //automatically called
        a=0;
        name=null;
    }
    //ye nhi likhenge tab bhi compiler apne aap instance variable mae default value
    //constructor ki madad se pass karadega
    */
    void show() {
        System.out.println(a + "  " + name);
    }
}

class Video130a {
    public static void main(String[] args) {
        Video130 ref = new Video130();//Video130() called
        ref.show();
    }
}