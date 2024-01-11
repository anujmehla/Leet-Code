public class LeetCode121 {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit1(prices));
    }
    /*
    this solution has O(n^2) time complexity
     */
    public static int maxProfit(int[] prices) {
        if (prices.length<=1) {
            return 0;
        }
        int max = 0;
        for (int i = 0; i < prices.length-1; i++) {
            for (int j = i+1; j < prices.length; j++) {
                int k = prices[j]-prices[i];
                if (k>max) {
                    max = k;
                }
            }
        }
        return max;
    }
    //more optimized as this has O(n) time complexity
    public static int maxProfit1(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }
        int maxProfit = 0;
        int minPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i]; // Update the minimum price
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            }
        }
        return maxProfit;
    }
}