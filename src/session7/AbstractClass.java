package session7;


/*
Abstraction is a process of hiding the implementation details and showing only functionality to the user.

Another way, it shows only essential things to the user and hides the internal details,
for example, sending SMS where you type the text and send the message.
You don't know the internal processing about the message delivery.

There are two ways to achieve abstraction in java
    Abstract class (0 to 100%)
    Interface (100%)

A class which is declared with the abstract keyword is known as an abstract class in Java.
It can have abstract and non-abstract methods (method with the body).
We can't create instance of abstract class. It can't be instantiate.
Abstract class can contain static methods and Constructor
It can contains final Methods.

https://www.javatpoint.com/difference-between-abstract-class-and-interface
*/

abstract class Bank{
    abstract int getRateOfInterest();
}
class SBI extends Bank{
    int getRateOfInterest(){return 7;}
}
class PNB extends Bank{
    int getRateOfInterest(){return 8;}
}

class AbstractClass{
    public static void main(String args[]){
        Bank b;

        b=new SBI();
        System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");
        b=new PNB();
        System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");

        // try to uncomment below line of code: CT error 'Bank' is abstract; cannot be instantiated
        // b= new Bank() ;
    }
}

/*
Rate of Interest is: 7 %
Rate of Interest is: 8 %
 */
