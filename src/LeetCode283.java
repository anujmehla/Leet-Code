import java.util.Arrays;

public class LeetCode283 {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeros(nums);
        for (int i:nums){
            System.out.print(i+" ");
        }
    }
    public static void moveZeros(int[] nums){
        int count=0;
        int zeros=0;
        int len=nums.length;
        for (int i=0; i< nums.length; i++){
            if(nums[i]==0){
                zeros++;
            }
            if (nums[i]!=0){
                nums[count++]=nums[i];
            }

        }
        for (int j=zeros; j>0; j--){
            nums[--len]=0;
        }
    }
}
