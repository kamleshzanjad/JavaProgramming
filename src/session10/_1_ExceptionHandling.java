package session10;
/*
Refer https://www.javatpoint.com/exception-handling-in-java

The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors so that the normal flow of the application can be maintained.
Exception is an abnormal condition.

In Java, an exception is an event that disrupts the normal flow of the program. It is an object which is thrown at runtime.

Hierarchy of Java Exception classes
The java.lang.Throwable class is the root class of Java Exception hierarchy inherited by two subclasses:
Exception and Error.

There are mainly two types of exceptions: checked and unchecked.
An error is considered as the unchecked exception. However, according to Oracle, there are three types of exceptions namely:
    1.	Checked Exception
    2.	Unchecked Exception
    3.	Error

Difference between Checked and Unchecked Exceptions
    1) Checked Exception
    The classes that directly inherit the Throwable class except RuntimeException and Error are known as checked exceptions.
    For example, IOException, SQLException, ClassNotFound, FileNotFound etc. Checked exceptions are checked at compile-time.
    2) Unchecked Exception
    The classes that inherit the RuntimeException are known as unchecked exceptions.
    For example, ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, NumberFormat
     etc. Unchecked exceptions are not checked at compile-time, but they are checked at runtime.
    3) Error
    Error is irrecoverable.
    Some example of errors are OutOfMemoryError, VirtualMachineError, AssertionError etc.


 */

public class _1_ExceptionHandling {
    public static void main(String args[]) {
        try {
            //code that may raise exception
            int data = 100 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        //rest code of the program
        System.out.println("rest of the code...");
    }
}

/*
java.lang.ArithmeticException: / by zero
rest of the code...
 */