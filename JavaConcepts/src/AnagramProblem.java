import java.util.*;

public class AnagramProblem {

    private static List<List<String>> createAnagrams(List<String> input) {
        List<List<String>> anagrams = new ArrayList<>();
        Map<String, List<String>> angMap = new HashMap<>();

        for (String inp : input) {
            boolean inputFlag = false;
            for (String key : angMap.keySet()) {
//                String. inp.toCharArray();
                if (key.contentEquals(inp)) {
                    /*
                    "eat": ["eat", "ate", "tea"]
                     */
                    List<String> availAngs = angMap.get(key);
                    availAngs.add(inp);
                    angMap.put(key, availAngs);

                    inputFlag = true;
                }
            }
            if (!inputFlag) {
                List<String> newAngList = new ArrayList<>();
                newAngList.add(inp);
                angMap.put(inp, newAngList);
            }
        }

        for (Map.Entry<String, List<String>> entry : angMap.entrySet()) {
            anagrams.add(entry.getValue());
        }

        return anagrams;
    }

    public static void main(String[] args) {
//        **Write a function that takes a list of strings and groups the anagrams together. An anagram is a word formed by rearranging the letters of another word.
//                A list of strings strs (1 ≤ len(strs) ≤ 1000, 1 ≤ len(strs[i]) ≤ 100).
//        Input: ["eat", "tea", "tan", "ate", "nat", "bat"]
//        Output: [['eat', 'tea', 'ate'], ['tan', 'nat'], ['bat']]**Write a function that takes a list of strings and groups the anagrams together. An anagram is a word formed by rearranging the letters of another word.
//                A list of strings strs (1 ≤ len(strs) ≤ 1000, 1 ≤ len(strs[i]) ≤ 100).
//        Input: ["eat", "tea", "tan", "ate", "nat", "bat"]
//        Output: [['eat', 'tea', 'ate'], ['tan', 'nat'], ['bat']]
//
//        Input: ["abc", "bca", "cba", "abcd", "dabc", "bac"]
//        Output: [['abc', 'bca', 'cba', 'bac'], ['abcd', 'dabc']]

        List<String> input = Arrays.asList(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});

        List<List<String>> output = createAnagrams(input);
        System.out.println(output.toString());
    }
}


//    Given a string s, find the length of the longest 
//        substring without repeating characters.
//        Input: s = "abcabcbb"
//        Output: 3
//        Explanation: The answer is "abc", with the length of 3.
