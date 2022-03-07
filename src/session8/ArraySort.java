package session8;

import java.util.Arrays;
import java.util.Collections;

public class ArraySort {
    public static void main(String args[]) {
        int a[] = new int[5];//declaration and instantiation
        a[0] = 10;//initialization
        a[1] = 20;
        a[2] = 70;
        a[3] = 40;
        a[4] = 50;

        Arrays.sort(a);
        System.out.println("Sorted array is: ");
        int len = a.length;
        int i;
        for (i = 0; i < len; i++) {
            System.out.println(a[i]);
        }

    }
}

/*
Sorted array is:
10
20
40
50
70


 */