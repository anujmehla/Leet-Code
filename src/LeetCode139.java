import java.util.ArrayList;
import java.util.List;

public class LeetCode139 {
    public static void main(String[] args) {
        String s = "leetcode";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("leet");
        wordDict.add("code");

        System.out.println(wordBreak(s,wordDict));
    }
    public static boolean wordBreak(String s,List<String> wordDict){
        for (String str:wordDict){
            if (!s.contains(str)){
                return false;
            }
        }
        return true;
    }
}
