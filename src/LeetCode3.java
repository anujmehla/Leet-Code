import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class LeetCode3 {
    public static void main(String[] args) {
        String s = "abcabcdbb";
        int result = lengthOfLongestSubstring(s);
        System.out.println(result);
    }
    public static int lengthOfLongestSubstring(String s){

        int ans=0;
        HashMap<Character,Integer> map = new HashMap<>();
        int i=0;
        for (int j=0; j<s.length(); j++){
            if (map.containsKey(s.charAt(j))){
                i = Math.max(map.get(s.charAt(j)),i );
            }
            ans = Math.max(ans,j-i+1);
            map.put(s.charAt(j),j+1);
        }
        return ans;
    }
}
