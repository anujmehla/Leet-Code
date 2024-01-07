import java.util.*;

public class LeetCode49 {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

       // Given an array of strings strs, group the anagrams together.
        // You can return the answer in any order.

       // An Anagram is a word or phrase formed by rearranging the letters
        // of a different word or phrase, typically using
        // all the original letters exactly once.

        //Input: strs = ["eat","tea","tan","ate","nat","bat"]
        //Output: [["bat"],["nat","tan"],["ate","eat","tea"]]





        System.out.println(groupAnagrams(strs));

    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groupedAnagrams = new HashMap<>();
        for (String str:strs){
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String sortedStr = String.valueOf(charArr);
            if (!groupedAnagrams.containsKey(sortedStr)){
                groupedAnagrams.put(sortedStr,new ArrayList<>());
            }
            groupedAnagrams.get(sortedStr).add(str);
        }
        return new ArrayList<>(groupedAnagrams.values());
    }
}
