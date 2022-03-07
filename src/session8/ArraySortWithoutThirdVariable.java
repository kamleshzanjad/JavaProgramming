package session8;

public class ArraySortWithoutThirdVariable {

    public static void main(String args[]) {
        int a[] = new int[3];//declaration and instantiation
        a[0] = 10;//initialization
        a[1] = 5;
        a[2] = 70;

        System.out.println("Sorted array is: ");
        int len = a.length;
        int i;
        int j;

        for (i = 0; i < len; i++) {

            for(j=i+1; j<len; j++){
                if(a[i]>a[j]){
                    // swap without using  third variable . Swap wlement only if earlier element is greater than later element

                    a[i] =a[i ]+ a[j];  // 10+ 5 =15
                    a[j]=a[i]-a[j];     // 15 -5 =10
                    a[i]=a[i]-a[j];     // 15-10 =5

                }

            }
            System.out.println(a[i]);
        }

    }
}

/*
Sorted array is:
5
10
70
 */