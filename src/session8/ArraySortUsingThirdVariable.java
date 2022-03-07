package session8;

import java.util.Arrays;

public class ArraySortUsingThirdVariable {

    public static void main(String args[]) {
        int a[] = new int[5];//declaration and instantiation
        a[0] = 10;//initialization
        a[1] = 20;
        a[2] = 70;
        a[3] = 40;
        a[4] = 50;


        System.out.println("Sorted array is: ");
        int len = a.length;
        int i;
        int j;
        int temp;
        for (i = 0; i < len; i++) {

            for(j=i+1; j<len; j++){
                if(a[i]>a[j]){
                    // swap using third variable . Swap wlement only if earlier element is greater than later element
                    temp =a[i];
                    a[i] =a[j];
                    a[j]=a[i];
                }

            }
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