public class LeetCode35 {
    public static void main(String[] args) {
        int[] nums = {1,5,7,9};
        int target =15;
        int result = searchInsert(nums,target);
        System.out.println(result);
    }
    public static int searchInsert(int[] nums, int target){
        int index=0;
        for (int i=0; i<nums.length; i++){
            if (target==nums[i]){
                index=i;
                break;
            }
            if (target<nums[i]){
                System.out.println("The value of i is "+i);
                index=i;
                break;
            }
            if (i==nums.length-1 && target>nums[i]){
                index=i+1;
            }
        }
        return index;
    }
}