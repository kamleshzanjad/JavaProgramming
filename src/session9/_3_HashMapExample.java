package session9;

import java.util.HashMap;
import java.util.Map;

/*
Java HashMap class implements the Map interface which allows us to store key and value pair, where keys should be unique.
If you try to insert the duplicate key, it will replace the element of the corresponding key.
It is easy to perform operations using the key index like updation, deletion, etc.
HashMap class is found in the java.util package.

HashMap in Java is like the legacy Hashtable class, but it is not synchronized.
It allows us to store the null elements as well, but there should be only one null key.
Since Java 5, it is denoted as HashMap<K,V>, where K stands for key and V for value.
It inherits the AbstractMap class and implements the Map interface.

Points to remember
    Java HashMap contains values based on the key.
    Java HashMap contains only unique keys.
    Java HashMap may have one null key and multiple null values.
    Java HashMap is non synchronized.
    Java HashMap maintains no insertion order.
    The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.

 */
public class _3_HashMapExample {
    public static void main(String args[]) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();//Creating HashMap
        map.put(1, "Mango");  //Put elements in Map
        map.putIfAbsent(2, "Apple");     ///putIfAbsent

        map.put(3, "Banana");
        map.put(4, "Banana");   //allow duplicate value

        map.put(1, "Grapes"); //trying duplicate key . It will replace value Mango with Grapes at Key 1

        System.out.println("Iterating Hashmap...");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }

}


/*
Iterating Hashmap...
1 Grapes
2 Apple
3 Banana
4 Banana
 */