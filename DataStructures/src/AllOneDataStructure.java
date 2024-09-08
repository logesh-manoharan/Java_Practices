import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

public class AllOneDataStructure {
    private Map<String, Integer> counterMap = null;

    public AllOneDataStructure() {
        counterMap = new HashMap<String, Integer>();
    }

    public void inc(String key) {
        if (counterMap.containsKey(key)) {
            counterMap.put(key, counterMap.get(key) + 1);
        } else {
            counterMap.put(key, 1);
        }
    }

    public void dec(String key) {
        if (counterMap.containsKey(key) && counterMap.get(key) > 0) {
            counterMap.put(key, counterMap.get(key) - 1);
        }
    }

    public String getMaxKey() {
        Collections.sort(counterMap.values().stream().toList());
    }

    public String getMinKey() {

    }

    public static void main(String[] args) {

    }
}
