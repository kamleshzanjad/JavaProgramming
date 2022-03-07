package session1;

public class _1_HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}


/*
Open Terminal
java -version

Right Click on src Folder> Mark Directory as > Test Source Root

Open Terminal
javac ./src/session1/_1_HelloWorld.java
Check out folder all Java files gets converted to .class files. These is byte code.
java ./src/session1/_1_HelloWorld

1) "Build" menu -> "Rebuild Project". Sometimes Intellij doesn't rewrite the classes because they already exist, this way you ask Intellij to rewrite everything.
2) "Run" menu -> "Edit configuration" -> delete the profile -> add back the profile ("Application" if it's a Java application), choose your main class from the "Main Class" dropdown menu.
3)"Build" menu -> "Rebuild Project".

if none of the above answers worked for you, just close your IntelliJ IDE and remove the IntelliJ IDE file and folder from the root of your project:
rm -rf .idea *.iml

Alternate ways
Menu : Build>Build Project
or Menu Build> Recompile _1_HelloWorld.java

Menu Run>
 */

