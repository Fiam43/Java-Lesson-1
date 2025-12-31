class Animal {
    void eat() {
        System.out .println("eating...Animal class...eat method");
    }
}
class lion extends Animal {
    void roar() {
        System.out.println("roaring...lion class...roar method");
    }
}

class Babylion extends lion {
    void weep() {
        System.out.println("weeping...Babylion class...sweep method");
    }
}

public class Main {
    public static void main(String[] args){
        Babylion obj = new Babylion();
        obj.weep();
        obj.roar();
        obj.eat();
    }
}