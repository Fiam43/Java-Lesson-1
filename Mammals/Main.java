class Mammals {
    void mam() {
        System.out.println("Inside Mammals Class");
    }
}

class Lion extends Mammals {
    void roar() {
        System.out.println("Inside Lions class");
    }
}

class Humans extends Mammals {
    void hum() {
        System.out.println("Inside Humans");
    }
}

class Main {
    public static void main(String[] args) {
        Lion obj = new Lion(); // object of child of child class
        obj.hum();//this will result in error in order to run this we need to create an object of Human
        obj.roar();
        obj.mam();


    }
}