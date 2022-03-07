package session11;

public class _2_StringOperation {
    public static void main(String[] args){
        String s="Welcome to Java Programming  ";
        System.out.println("ChartAt " + s.charAt(3));    //   ChartAt c
        System.out.println("indexOf " + s.indexOf("Java"));    //   output =>indexOf 11

        System.out.println("toLowerCase " + s.toLowerCase());    //   output => toLowerCase welcome to java programming
        System.out.println("toUpperCase " + s.toUpperCase());    //   output => toUpperCase WELCOME TO JAVA PROGRAMMING

        System.out.println("trim '" + s.trim()+"'");    //   output => trim 'Welcome to Java Programming'
        System.out.println("substring " + s.substring(3));    //   output =>s ubstring come to Java Programming
        System.out.println("substring " + s.substring(3,5));    //   output =>substring co

        System.out.println("replace " + s.replace("to", "in"));    //   output =>replace Welcome in Java Programming
        System.out.println("replaceAll " + s.replaceAll(" ", ""));    //   output =>replaceAll WelcometoJavaProgramming


    }
}

/*
ChartAt c
indexOf 11
toLowerCase welcome to java programming
toUpperCase WELCOME TO JAVA PROGRAMMING
trim 'Welcome to Java Programming'
substring come to Java Programming
substring co
replace Welcome in Java Programming
replaceAll WelcometoJavaProgramming
 */