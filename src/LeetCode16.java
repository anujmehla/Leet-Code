import java.util.Arrays;

public class LeetCode16 {
    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        int target =1;
        int result  = threeSumClosest(nums,target);
        System.out.println(result);
    }
    public static int threeSumClosest(int[] nums, int target){
        int result = nums[0]+nums[1]+nums[nums.length-1];
        Arrays.sort(nums);
        for (int i=0; i< nums.length-2; i++){
            int aPointer = i+1;
            int bPointer = nums.length-1;
            while (aPointer<bPointer){
                int currentSum = nums[i]+nums[aPointer]+nums[bPointer];
                if (currentSum>target){
                    bPointer--;
                } else {
                    aPointer++;
                }
                if (Math.abs(currentSum-target)<Math.abs(result-target)){
                    result =currentSum;
                }
            }
        }
        return result;
    }
}