package sorting;

import java.util.*;

/*
TreeMap will help us to sort the Map entries by Keys.
In order to sort the Map by <values>. We have to follow few steps
 */
public class SortByMapValue {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Vasanth", 20);
        hashMap.put("Logesh", 21);
        hashMap.put("Kamalesh", 18);

        // Map => List of Entries(Key-Value Pairs)
        List<Map.Entry<String, Integer>> listOfEntries = new ArrayList<>(hashMap.entrySet());
        listOfEntries.sort(Map.Entry.comparingByValue()); // normal sort
        // listOfEntries.stream().sorted(Map.Entry.comparingByValue()); // stream to sort

        Iterator<Map.Entry<String, Integer>> iterator = listOfEntries.iterator();
        while(iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
        }
    }
}
