public class LeetCode26 {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int answer = removeDuplicate(nums);
        System.out.println(answer);
    }
    public static int removeDuplicate(int[] nums){
        int j=1;
        for (int i=0; i<nums.length-1; i++){
            if (nums[i] != nums[i+1]){
                nums[j]=nums[i+1];
                j++;
            }
        }
        return j;
    }
}
// remove the duplicates items from the sorted array