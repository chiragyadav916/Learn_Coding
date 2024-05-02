//interface methods
interface Video156 {//client

    void webdesign();//public+abstract

    void webdeveloper();//public+abstract

}

abstract class Developer implements Video156 {
    @Override
    public void webdesign() {//developer
        System.out.println("Green!");
    }

    public static void main(String[] args) {
//        Video156 r = new Developer();
//        r.webdesign();
        Video156 r1=new Developer1();
        r1.webdesign();
        r1.webdeveloper();
    }
}

class Developer1 extends Developer{
    @Override
    public void webdeveloper(){
        System.out.println("Javascript!");
    }
}
