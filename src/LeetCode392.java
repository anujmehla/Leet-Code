public class LeetCode392 {
    public static void main(String[] args) {
        String s = "", t = "ahbgdc";
        boolean res = isSubsequence(s,t);
        System.out.println(res);
    }
    public static boolean isSubsequence(String s,String t){
        if (s.isEmpty()) return true;
        int p1=0,p2=0;
        while (p1<s.length()&&p2<t.length()){
            if (s.charAt(p1)==t.charAt(p2)){
                p1++;
                p2++;
            } else {
                p2++;
            }
        }
        if (p1==s.length()){
            return true;
        }
        return false;
    }
}
//if s is a subsequence of t
