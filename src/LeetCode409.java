public class LeetCode409 {
    public static void main(String[] args) {
        String s = "abccccdd";
        int result = longestPalindrome(s);
        System.out.println(result);
    }
    public static int longestPalindrome(String s){
        //to count the occurrence of the characters
        int[] charCounts = new int[128];
        for (char c:s.toCharArray()){
            charCounts[c]++;
        }
        int result = 0;
        for (int charCount : charCounts){
            result += charCount/2*2;
            if(result%2==0 && charCount%2==1){
                result+=1;
            }
        }
        return result;
    }
}