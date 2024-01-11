import java.util.HashMap;
import java.util.Map;

public class LeetCode136 {
    public static void main(String[] args) {
        int[] nums = {2,2,1};
        System.out.println(singleNumber1(nums));
    }
    // this has time and space complexity O(n)
    public static int singleNumber(int[] nums) {
        Map<Integer,Integer> record = new HashMap<>();
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            record.put(nums[i], record.getOrDefault(nums[i],0)+1);
        }
        for (Map.Entry<Integer,Integer> entry : record.entrySet()) {
            if (entry.getValue()==1) {
                ans = entry.getKey();
            }
        }
        return ans;
    }
    //more optimized way it to use bitwise xor operator
    public static int singleNumber1(int[] nums) {
        int result = 0;
        for (int i : nums) {
            result ^=i;
        }
        return result;
    }
}
