public class LeetCode977 {
    public static void main(String[] args) {
        int[] nums = {-7,-3,2,3,11};
        nums = sortedSquares(nums);
        for (int i: nums){
            System.out.print(i+" ");
        }
    }
    public static int[] sortedSquares(int[] nums){
       int size = nums.length;
       int[] output = new int[size];
       int current = size-1;
       int p1 = 0;
       int p2 = nums.length-1;
       while (p1<=p2){
           int tmpLeft = nums[p1]*nums[p1];
           int tmpRight = nums[p2]*nums[p2];
           if (tmpLeft>tmpRight){
               output[current] = tmpLeft;
               current--;
               p1++;
           } else {
               output[current] = tmpRight;
               current--;
               p2--;
           }
       }
        return output;
    }
}