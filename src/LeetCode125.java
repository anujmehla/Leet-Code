public class LeetCode125 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";

        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        String result ="";
        for (char c:s.toCharArray()){
            if (Character.isDigit(c)||Character.isLetter(c)){
                result+=c;
            }
        }
        result = result.toLowerCase();
        int aPointer =0;
        int bPointer =result.length()-1;
        while (aPointer<=bPointer){
            if (result.charAt(aPointer)!=result.charAt(bPointer)){
                return false;
            }
            aPointer++;
            bPointer--;
        }
        return true;
    }
}
