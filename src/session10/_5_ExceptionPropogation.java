package session10;
/*
An exception is first thrown from the top of the stack and if it is not caught, it drops down the call stack to the previous method.
If not caught there, the exception again drops down to the previous method,
 and so on until they are caught or until they reach the very bottom of the call stack.
This is called exception propagation.
By default Unchecked Exceptions are forwarded in calling chain (propagated).
Note: By default, Checked Exceptions are not forwarded in calling chain (propagated).
 */

public class _5_ExceptionPropogation {
    void m() {
        System.out.println("Inside method m");
        int data = 50 / 0;

        // Uncomment below line.
        //  throw new java.io.IOException("device error");//checked exception
    }

    void n() {
        System.out.println("Inside method n");
        m();
    }

    void p() {
        System.out.println("Inside method p");
        try {
            n();
        } catch (Exception e) {
            System.out.println("exception handled");
        }
    }

    public static void main(String args[]) {
        _5_ExceptionPropogation obj = new _5_ExceptionPropogation();
        obj.p();
        System.out.println("normal flow...");
    }

}

/*
Inside method p
Inside method n
Inside method m
exception handled
normal flow...
 */
