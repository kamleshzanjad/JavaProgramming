package session9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
/*
HashSet class implements Set Interface.
It represents the collection that uses a hash table for storage.
Hashing is used to store the elements in the HashSet.
It contains unique items.

 */

public class _2_SetExample {
    public static void main(String args[]) {

//Creating HashSet and adding elements
        HashSet<String> set = new HashSet<String>();
        //Replace HashSet With TreeSet and try
        // TreeSet<String> set = new TreeSet<>()

        // PolyMorphism
        Set<String>  set1;
        set1= new TreeSet<>();   /// it will sort in asscending order
        set1 = new HashSet<>();

        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");

//Traversing elements
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}


/*
Vijay
Ravi
Ajay

 */