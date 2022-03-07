package session7;

//Example of an abstract class that has constructor, abstract and non-abstract/concrete methods
abstract class Bike {
    Bike() {
        System.out.println("Calling Constructor. Bike is created");
    }

    abstract void run();

    void changeGear() {
        System.out.println("Calling non-abstract or concrate method. Gear changed");
    }
}

//Creating a Child class which inherits Abstract class
class Honda extends Bike {
    void run() {
        System.out.println("running safely..");
    }
}

//Creating a Test class which calls abstract and non-abstract methods
class TestAbstraction2 {
    public static void main(String args[]) {
        Bike obj = new Honda();
        obj.run();
        obj.changeGear();
    }
}


/*
Calling Constructor. Bike is created
running safely..
Calling non-abstract or concrate method. Gear changed
 */