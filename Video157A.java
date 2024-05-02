//multiple inheritance
interface Video157A {
    void show();
}

interface A4 {
    void show();
}

class Multiple implements A4, Video157A {
    public void show(){
        System.out.println("Sunita Yadav");
    }
    public static void main(String[] args) {
        Multiple r = new Multiple();
        r.show();
    }
}
