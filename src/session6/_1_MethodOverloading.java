package session6;
/*
Polymorphism
Poly = many.
Morphism = form

Method Overloading in Java
If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.
If we have to perform only one operation, having same name of the methods increases the readability of the program.
Suppose you have to perform addition of the given numbers but there can be any number of arguments,
if you write the method such as a(int,int) for two parameters, and b(int,int,int) for three parameters
then it may be difficult for you as well as other programmers to understand the behavior of the method because its name differs.
So, we perform method overloading to figure out the program quickly.

Advantage of method overloading
    Method overloading increases the readability of the program.

There are two ways to overload the method in java
    By changing number of arguments
    By changing the data type

 */

class Adder {
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class _1_MethodOverloading {
    public static void main(String[] args) {
        System.out.println(Adder.add(11, 11));
        System.out.println(Adder.add(11, 11, 11));
    }
}


/*
Output of program is
22
33
 */

