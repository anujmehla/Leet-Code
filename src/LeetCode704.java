public class LeetCode704 {
    public static void main(String[] args) {
        int nums[] = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(search(nums,target));
    }
    public static int search(int[] nums,int target){
       if (nums.length==0) return -1;
       int left=0;
       int right= nums.length-1;
      while (left<right){
          int midPoint = left+(right-left)/2;
          if (nums[midPoint]==target){
              return midPoint;
          } else if (nums[midPoint]>target) {
              right=midPoint-1;
          } else {
              left=midPoint+1;
          }
      }
       return -1;
    }
}
