package session1;
// package name is like com.company name all small letter. It is similar to Folder/ Container
// Class Name: Starts with Capital Letter. It must be Noun
// Variable = it is verb. it follows Camel casing Format. e.g iAmAnIndianCitizen

public class _2_Variables {
    static int m=100;//static variable
    int instanceVariable=50;//instance variable

    void method()
    {
        int n=90;//local variable
    }

    public static void main(String args[])
    {
        int data=50;//local variable


        System.out.println("Printing local variable data " + data);
        System.out.println("Printing Static variable data " + _2_Variables.m);  // to access static variable use ClassName.VariableName


        _2_Variables obj = new _2_Variables() ;

        // ClassName refVariable = new ClassName()
        // Variables is class Name
        // obj is ref variable of class Variable
        // new memory is allocated
        // Variables()   it is constructor.
        // Variables obj  => it is called as declaration
        //  new Variables() ; > it is class instantiation. instance of class is created and memory is allocated.


        System.out.println("Printing Instance variable data " + obj.instanceVariable);
        // Instance variable needs to be calls with refVariable.VariableNAme

    }
}

/*
Output is
Printing local variable data 50
Printing Static variable data 100
Printing Instance variable data 50
 */

/*
Right click onn _2_Variables> Run _2_Variables.main()
1) Local Variable
    A variable declared inside the body of the method is called local variable.
    You can use this variable only within that method and the other methods in the class aren't even aware that the variable exists.

2) Instance Variable
    A variable declared inside the class but outside the body of the method, is called an instance variable.
    It is called an instance variable because its value is instance-specific and is not shared among instances.

3) Static variable
    A variable that is declared as static is called a static variable.
    It cannot be local.
    You can create a single copy of the static variable and share it among all the instances of the class.
    Memory allocation for static variables happens only once when the class is loaded in the memory.

 */