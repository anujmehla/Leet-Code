public class Pangram {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        System.out.println(checkPangram(str.toLowerCase()));
    }
    public static boolean checkPangram(String str) {
        if (str.length()<26) {
            return false;
        } else {
            for (char i = 'a'; i <= 'z'; i++) {
                if (str.indexOf(i) < 0) {
                    return false;
                }
            }
        return true;
        }
    }
}
