import java.util.Scanner;

//Interface
interface Video154 {//client
    void input();//public+ abstract

    void output();//public+ abstract
}

class A3 implements Video154 {//this code not shown to client
    String name;
    double sal;

    public void input() {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter Username: ");
        name = r.nextLine();

        System.out.println("Enter Salary: ");
        sal = r.nextDouble();
    }

    public void output() {
        System.out.println(name + "  " + sal);
    }

    public static void main(String[] args) {
        Video154 r = new A3();
        r.input();
        r.output();
    }
}