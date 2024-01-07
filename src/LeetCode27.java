import java.util.logging.Logger;

public class LeetCode27 {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        System.out.println(removeElement(nums, 3));
        print(nums);
    }
    public static int removeElement(int[] nums, int val) {
        int count = 0;
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=3) {
                nums[k]=nums[i];
                k++;
                count++;
            }
        }
        return count;
    }
    public static void print(int[] nums) {
        for (int i : nums) {
            System.out.print(i+" ");
        }
    }
}
//output = [2,2,_,_]