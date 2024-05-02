//abstract method
abstract class Video153A {
    public abstract void Developer();
}

class HTML extends Video153A {
    @Override//type of comment
    public void Developer() {
        System.out.println("Tim Berners Lee");
    }
}

class Java extends Video153A {
    @Override//type of comment
    public void Developer() {
        System.out.println("James Gosling");
    }

    public static void main(String[] args) {
        HTML h = new HTML();
        Java j = new Java();
        Video153A h1 = new HTML();
        Video153A j1 = new Java();
        h.Developer();
        h1.Developer();
        j.Developer();
        j1.Developer();
    }
}
