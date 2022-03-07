package session5;

/*
The idea behind inheritance in Java is that you can create new classes that are built upon existing classes.
When you inherit from an existing class, you can reuse methods and fields of the parent class.
Moreover, you can add new methods and fields in your current class also.
Use keyword extends
 */

/*
Terms used in Inheritance
Class: A class is a group of objects which have common properties. It is a template or blueprint from which objects are created.
Sub Class/Child Class: Subclass is a class which inherits the other class.
                         It is also called a derived class, extended class, or child class.
Super Class/Parent Class: Superclass is the class from where a subclass inherits the features.
                          It is also called a base class or a parent class.
Reusability: As the name specifies, reusability is a mechanism which facilitates you to reuse the fields and methods of the existing class when you create a new class.
              You can use the same fields and methods already defined in the previous class.
 */

class Employee{
    float salary=40000;
}

class Programmer extends Employee{
    int bonus=10000;
}

public class _1_Inheritance {
    public static void main(String args[]){
        Programmer p=new Programmer();
        System.out.println("Programmer salary is:"+p.salary);
        System.out.println("Bonus of Programmer is:"+p.bonus);
    }
}


/*
Programmer salary is:40000.0
Bonus of Programmer is:10000
 */