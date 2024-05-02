//simple inheritance
class Video140 {//superclass
    int roll, marks;
    String name;

    //    private void input(){
    void input() {
        System.out.println("Enter Details: ");
    }
}

class chirag extends Video140 {//subclass

    void disp() {
        roll = 5767;
        name = "Chirag";
        marks = 89;
        System.out.println(roll + "  " + name + "  " + marks);
    }

    public static void main(String[] args) {
        chirag c = new chirag();
        c.input();
        c.disp();
    }
}
