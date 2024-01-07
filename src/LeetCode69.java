public class LeetCode69 {
    static int x =10;
    public static void main(String[] args) {
        System.out.println(x);

        System.out.println(mySqrt(8));
    }
    public static int mySqrt(int x) {
        //condition check
        if(x<2) {
            return x;
        }
        //using binary search approach
        int end = x/2;
        int start = 1;

        while(start <= end) {
            int mid = (start + end)/2;
            if((long)mid*mid>x) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return end;
    }
}