public class LeetCode11 {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int result = maxArea(height);
        System.out.println(result);
    }
    public static int maxArea(int[] height){
        int leftPointer = 0;
        int rightPointer = height.length-1;

        int max_area = 0;
        while (leftPointer<rightPointer){
            if (height[leftPointer]<height[rightPointer]){
                max_area = Math.max(max_area,height[leftPointer]*(rightPointer-leftPointer));
                leftPointer++;
            } else {
                max_area = Math.max(max_area,height[rightPointer]*(rightPointer-leftPointer));
                rightPointer--;
            }
        }
        return max_area;
    }
}
