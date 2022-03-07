package session6;
/*
If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.
In other words, If a subclass provides the specific implementation of the method that has been declared by one of its parent class,
it is known as method overriding.

Usage of Java Method Overriding
    Method overriding is used to provide the specific implementation of a method which is already provided by its superclass.

Method overriding is used for runtime polymorphism

Rules for Java Method Overriding
    The method must have the same name as in the parent class
    The method must have the same parameter as in the parent class.
    There must be an IS-A relationship (inheritance).

*/

class Bank {
    int getRateOfInterest() {
        return 0;
    }
}

//Creating child classes.
class SBI extends Bank {
    int getRateOfInterest() {
        return 8;
    }
}

class ICICI extends Bank {
    int getRateOfInterest() {
        return 7;
    }
}

//Test class to create objects and call the methods
class _2_MethodOverriding {
    public static void main(String args[]) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        System.out.println("SBI Rate of Interest: " + s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: " + i.getRateOfInterest());
    }
}


/*
SBI Rate of Interest: 8
ICICI Rate of Interest: 7
 */