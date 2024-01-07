public class LeetCode66 {
    public static void main(String[] args) {
        int[] digits = {1,2,3,4};
        digits = plusOne(digits);
        for (int i:digits){
            System.out.print(i+" ");
        }
    }
    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        int another = len-1;
        int tmp=0;
        for (int i=len-1; i>0; i--){
            tmp=digits[i];

        }
        System.out.println(tmp);

        return digits;
    }
}
