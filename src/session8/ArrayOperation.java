package session8;


//Java Program to illustrate how to declare, instantiate, initialize
//and traverse the Java array.
/*
Normally, an array is a collection of similar type of elements which has contiguous memory location.

Java array is an object which contains elements of a similar data type.
Additionally, The elements of an array are stored in a contiguous memory location.
It is a data structure where we store similar elements.
We can store only a fixed set of elements in a Java array.

Array in Java is index-based, the first element of the array is stored at the 0th index,
2nd element is stored on 1st index and so on.


 */

public class ArrayOperation {
    public static void main(String args[]){
        int a[]=new int[5];//declaration and instantiation
        a[0]=10;//initialization
        a[1]=20;
        a[2]=70;
        a[3]=40;
        a[4]=50;


        //traversing array
        for(int i=0;i<a.length;i++)//length is the property of array
            System.out.println(a[i]);



        int b[]={33,3,4,5};//declaration, instantiation and initialization

        //printing array
        for(int i=0;i<b.length;i++)
            System.out.println(b[i]);


        int arr[]={33,3,4,5};

        //printing array using for-each loop
        for(int i:arr)
            System.out.println(i);


    }
}
