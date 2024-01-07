import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode15 {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> res = threeSum(nums);
        for (List i : res){
            System.out.print(i+" ");
        }
    }
    //conditions i!=j, i!=k, j!=k and i+j+k=0
    public static List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (nums==null || nums.length<3){
            return result;
        }
        Arrays.sort(nums);
        for (int i=0; i< nums.length-2; i++){
            if (i==0 || i>0 && nums[i-1]!=nums[i]){
                int low,high;
                low = i+1;
                high = nums.length-1;
                int sum = 0-nums[i];
                while (low<high){
                    if (sum==nums[low]+nums[high]){
                        result.add(Arrays.asList(nums[i],nums[low],nums[high]));
                        while(low<high && nums[low] == nums[low+1]) low++;
                        while (low<high && nums[high] == nums[high-1]) high--;
                        low++;
                        high--;
                    } else if (nums[low] +nums[high] < sum) {
                        low++;
                    } else {
                        high--;
                    }
                }
            }
        }
        return result;
    }
}
