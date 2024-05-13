import java.util.LinkedList;
import java.util.List;

public class LeetCode17 {
    public static void main(String[] args) {
        String digits = "23";
        List<String> ans = letterCombinations(digits);
        for (String an : ans) {
            System.out.println(an);
        }
    }
    //expected output = ["ad","ae","af","bd","be","bf","cd","ce","cf"]
    public static List<String> letterCombinations(String digits) {
        LinkedList<String> ans = new LinkedList<String>();
        if(digits.isEmpty()) return ans;
        String[] mapping = new String[] {"0","1","abc","def",
                "ghi","jkl","mno","pqrs","tuv","wxyz"};
        ans.add("");
        for(int i = 0; i <digits.length(); i++) {
            int x = Character.getNumericValue(digits.charAt(i));
            while(ans.peek().length() == i) {
                String t = ans.remove();
                for(char s : mapping[x].toCharArray()) {
                    ans.add(t+s);
                }
            }
        }
        return ans;
    }

    public static String helperFunction(String s) {
        int i = Integer.parseInt(s);
        return switch (i) {
            case 2 -> "abc";
            case 3 -> "def";
            case 4 -> "ghi";
            case 5 -> "jkl";
            case 6 -> "mno";
            case 7 -> "pqrs";
            case 8 -> "tuv";
            case 9 -> "wxyz";
            default -> "";
        };
    }
}