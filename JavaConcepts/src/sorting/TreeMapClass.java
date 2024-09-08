package sorting;

import java.util.*;

public class TreeMapClass {
    /*
    TreeMap will sort upon the keys.
    Sorting will be based on the DataTypes or Comparator specified while initialisation
     */
    static TreeMap<String, Integer> treeMap = new TreeMap<>();
    public static void main(String[] args) {
        treeMap.put("Vasanth", 20);
        treeMap.put("Logesh", 21);
        treeMap.put("Kamalesh", 18);

        /*
        Value with which we are going to iterate. Here we are going to iterate with Entry.
        Iterator is just a replacement of For Loop
         */
        Iterator<Map.Entry<String, Integer>> iterator = treeMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
        }
    }
}
