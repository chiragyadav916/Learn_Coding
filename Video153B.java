//abstract method
abstract class Video153B {
    public abstract void Developer();
    public abstract void Rank();
}

abstract class HTML1 extends Video153B {//automatic abstract
    @Override//type of comment
    public void Developer() {
        System.out.println("Tim Berners Lee");
    }
}

class Java1 extends HTML1 {
    @Override//type of comment
    public void Rank() {
        System.out.println("2nd");
    }

    public static void main(String[] args) {
       Java1 j=new Java1();
       j.Rank();
       j.Developer();
       Video153B j1=new Java1();
       j1.Rank();
       j1.Developer();
    }
}
