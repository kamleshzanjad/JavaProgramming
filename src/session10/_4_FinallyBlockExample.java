package session10;

/*
Refer https://www.javatpoint.com/difference-between-throw-and-throws-in-java
https://www.javatpoint.com/difference-between-final-finally-and-finalize
https://www.javatpoint.com/exception-handling-with-method-overriding

Java finally block is a block used to execute important code such as closing the connection, closing files, releasing resources etc.

Java finally block is always executed whether an exception is handled or not.
Therefore, it contains all the necessary statements that need to be printed regardless of the exception occurs or not.

The finally block follows the try-catch block
Why use Java finally block?
    finally block in Java can be used to put "cleanup" code such as closing a file, closing connection, etc.
    The important statements to be printed can be placed in the finally block.

 */
public class _4_FinallyBlockExample {
    public static void main(String args[]) {

        try {
//below code do not throw any exception
            int data = 25 / 5;
            System.out.println("Inside Try block: " + data);
        }
//catch won't be executed
        catch (NullPointerException e) {
            System.out.println("Inside Catch  bock" + e);
        }
//executed regardless of exception occurred or not
        finally {
            System.out.println("finally block is always executed");
        }

        System.out.println("Printing rest of phe code...");
    }

}

/*
Inside Try block: 5
finally block is always executed
Printing rest of phe code...
 */