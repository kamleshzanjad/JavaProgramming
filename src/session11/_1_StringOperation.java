package session11;
/*
https://www.javatpoint.com/java-string
string is basically an object that represents sequence of char values. An array of characters works same as Java string
Java String class provides a lot of methods to perform operations on strings such as
compare(), concat(), equals(), split(), length(), replace(), compareTo(), intern(), substring()
 */

public class _1_StringOperation {
   // 1) String Literal
   // Each time you create a string literal, the JVM checks the "string constant pool" first.
    // If the string already exists in the pool, a reference to the pooled instance is returned.
    // If the string doesn't exist in the pool, a new string instance is created and placed in the pool. For example:
    //only one object will be created
    String s1="Welcome";
    String s2="Welcome";//It doesn't create a new instance



    //2) By new keyword
    String s=new String("Welcome");//creates two objects and one reference variable

    //In such case, JVM will create a new string object in normal (non-pool) heap memory,
    // and the literal "Welcome" will be placed in the string constant pool.
    // The variable s will refer to the object in a heap (non-pool).

}
