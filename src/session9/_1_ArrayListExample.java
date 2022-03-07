package session9;
import java.util.*;


/*
https://www.javatpoint.com/collections-in-java
Understand Interfaces, Abstract class.
 It uses a dynamic array to store the duplicate element of different data types.
 The ArrayList class maintains the insertion order and
 It is non-synchronized.
 The elements stored in the ArrayList class can be randomly accessed
 */

public class _1_ArrayListExample {
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist

        // Comment above line 15 and uncomment below line Line 18. Use LinkedList instead of ArrayList
        // LinkedList<String> list = new LinkedList<>();

        // Use List instead of ArrayList
        // List<String> list = new LinkedList<>();

        list.add("Ravi");//Adding object in arraylist
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");

        //Traversing list through Iterator
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("\nPrinting full list");
        System.out.println(list);


        System.out.println("\nPrinting Second Elemetn of  list");
        System.out.println(list.get(2));

        list.remove(3);
        System.out.println("\nPrinting full list after deleting one element");
        System.out.println(list);list.clear();


        Collections.sort(list);
        System.out.println("\nPrinting full list after deletion");
        System.out.println(list);
        list.clear();
    }
}

/*
Ravi
Vijay
Ravi
Ajay

Printing full list
[Ravi, Vijay, Ravi, Ajay]

Printing Second Elemetn of  list
Ravi

Printing full list after deleting one element
[Ravi, Vijay, Ravi]

Printing full list after deletion
[]
 */