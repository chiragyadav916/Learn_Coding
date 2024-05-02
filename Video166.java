///co-variant return type
class Video166 {
    Video166 show() {
        System.out.println("In A");
//        return new Video166();
        return this;//returning current class object
        //this-->new Video166()
    }
}

class B8 extends Video166 {
    @Override
    B8 show() {
        super.show();
        System.out.println("In B");
//        return new B8();
//        return this;
        return new B8();
    }

    public static void main(String[] args) {
        B8 obj = new B8();
        obj.show();
    }
}
