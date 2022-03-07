package session4;

public class _2_ClassMethod {

    public void methodDisplay(String message){
        System.out.println("Printinng Message: " + message);
    }

}


/*


A method is a block of code or collection of statements or a set of code grouped together to perform a certain task or operation.
It is used to achieve the reusability of code.
We write a method once and use it many times.
We do not require to write code again and again.
It also provides the easy modification and readability of code, just by adding or removing a chunk of code.
The method is executed only when we call or invoke it.


Method Signature: Every method has a method signature.
It is a part of the method declaration.
It includes the method name and parameter list.

Access Specifier: Access specifier or modifier is the access type of the method. It specifies the visibility of the method. Java provides four types of access specifier:
    o	Public: The method is accessible by all classes when we use public specifier in our application.
    o	Private: When we use a private access specifier, the method is accessible only in the classes in which it is defined.
    o	Protected: When we use protected access specifier, the method is accessible within the same package or subclasses in a different package.
    o	Default: When we do not use any access specifier in the method declaration, Java uses default access specifier by default. It is visible only from the same package only.

Return Type: Return type is a data type that the method returns.
             It may have a primitive data type, object, collection, void, etc.
             If the method does not return anything, we use void keyword.

Method Name: It is a unique name that is used to define the name of a method.
            It must be corresponding to the functionality of the method.
            Suppose, if we are creating a method for subtraction of two numbers, the method name must be subtraction().
            A method is invoked by its name.

Parameter List: It is the list of parameters separated by a comma and enclosed in the pair of parentheses.
                It contains the data type and variable name.
                If the method has no parameter, left the parentheses blank.
Method Body: It is a part of the method declaration.
              It contains all the actions to be performed.
              It is enclosed within the pair of curly braces.


 */