package session11;
/*
Refer: https://www.javatpoint.com/StringBuffer-class
https://www.javatpoint.com/difference-between-string-and-stringbuffer
https://www.javatpoint.com/difference-between-stringbuffer-and-stringbuilder
https://www.javatpoint.com/string-comparison-in-java

A String that can be modified or changed is known as mutable String.
StringBuffer and StringBuilder classes are used for creating mutable strings.

1) StringBuffer Class append() Method

The append() method concatenates the given argument with this String.
 */


public class _4_StringBuffer {
    public static void main(String args[]){
        StringBuffer sb=new StringBuffer("Hello ");
        sb.append("Java");//now original string is changed
        System.out.println(sb);//prints Hello Java
    }

}

/*
Hello Java
 */
