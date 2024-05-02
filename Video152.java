//abstract class
abstract class Video152 {//common properties

    Video152() {
        System.out.println("Sunita Yadav!");
    }

    //only body because we don't know the exact properties
    public abstract void sound();
}

class Dog extends Video152 {
    Dog() {
        super();
    }

    public void sound() {
        System.out.println("Bark");
    }
}

class Lion extends Video152 {
    Lion() {
        super();
    }

    public void sound() {
        System.out.println("Roar");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        Lion l = new Lion();
        l.sound();
    }
}

