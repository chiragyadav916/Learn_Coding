//interface static methods
interface Video160 {
    public static void show() {
        System.out.println("Sunita Yadav!");
    }
}

class A7 {
    public static void main(String[] args) {
        Video160.show();

//        //error
//        B6 r = new B6();
//        r.show();
    }
}

//Error- we can't override
//class B6 implements Video160 {
//    @Override
//    public static void show() {
//        System.out.println("Chirag Yadav!");
//    }
//}