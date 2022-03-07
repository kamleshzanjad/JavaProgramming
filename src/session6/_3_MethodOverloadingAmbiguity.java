package session6;

class Adder1 {
    /*static int add(int a, int b) {
        return a + b;
    }
    static int add(int a, int b, int c) {
        return a + b + c;
    }*/

    static float add(float a, int b) {
        return a + b;
    }

    static float add(int a, float b) {
        return a + b;
    }
}

 class _3_MethodOverloadingAmbiguity {

    public static void main(String[] args) {

        System.out.println(Adder1.add(11.00f, 11));
        System.out.println(Adder1.add(11, 11.00f));

        // uncomment below code and see Compile Time (CT) error Ambiguous Method call.both   //  reference to add is ambiguous
        // System.out.println(Adder1.add(11, 11));
    }
}


/*
Output of program is
22.0
22.0
 */

