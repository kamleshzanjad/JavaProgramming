package session11;

public class _3_StringOperation2 {
    public static void main(String[] args){
        String s ="Welcome to Java Programming";
        String[] arrString = s.split(" ");

        System.out.println("Printing array");
        for (String ele:arrString) {
            System.out.println(ele);
        }


        System.out.println("Length " + s.length());  //  Length 27
        System.out.println("isStratrs with " + s.startsWith("Jav"));  //isStratrs with false
        System.out.println("isEmpty "+ s.isEmpty());  //isEmpty false
        System.out.println("Concat: "+ s.concat(". It is great learning."));  //Concat: Welcome to Java Programming. It is great learning.

    }
}

/*
Printing array
Welcome
to
Java
Programming
Length 27
isStratrs with false
isEmpty false
Concat: Welcome to Java Programming. It is great learning.
 */