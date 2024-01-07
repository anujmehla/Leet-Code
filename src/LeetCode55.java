public class LeetCode55 {
    public static void main(String[] args) {
        int nums[] = {2,0,0};
        System.out.println(canJump(nums));
    }
    public static boolean canJump(int[] nums){
        int len= nums.length;
        for (int i=1; i<len; i++){
            boolean canReach = false;
            for (int j=i-1; j>=0; j--){
                if ((i-j)<=nums[j])
                    canReach=true;
                if (canReach==false)
                    return false;
            }
        }
        return true;
    }
}
