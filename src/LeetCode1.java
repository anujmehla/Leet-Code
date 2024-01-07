import java.util.HashMap;

public class LeetCode1 {
    public static void main(String[] args) {
        int[] a = {2,7,11,15};
        int target = 26;
        int[] b= twoSum(a,target);
        for (int i:b){
            System.out.print(b);
        }
    }
    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            int comp = target-nums[i];
            if (map.containsKey(comp)){
                return new int[] {map.get(comp),i};
            } else {
                map.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}