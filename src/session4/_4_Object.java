package session4;

public class _4_Object {
    int id;      // State or field or data member or instance variable.
    String name;

    ///Method
    public void display(){
        System.out.println("Inside method display");
    }

}

class TestClass{
    public static void main(String[] args){
        _4_Object obj = new _4_Object();   // at this point memory is allocated
        //  declarration  = >  _4_Object obj
        //  new = memory is allocated
        //  default complier provided constructed is called.  _4_Object();
        // this constructor will assign default value 0 to integer and null to String.

        obj.display();
        System.out.println(" id " + obj.id);
        System.out.println(" Name is '" + obj.name + "'");
    }
}

/*
Inside method display
 */


/*
An entity that has state and behavior is known as an object
e.g., chair, bike, marker, pen, table, car, etc.

It can be physical or logical (tangible and intangible).
The example of an intangible object is the banking system.

An object has three characteristics:
    State   -   variables, fields. properties
    Behavior - methods, procedure
    Identity

 */