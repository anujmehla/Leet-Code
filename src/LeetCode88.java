public class LeetCode88 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        merge(nums1,m,nums2,n);
        for (int i:nums1){
            System.out.print(i+" ");
        }
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n){
        int p1 = m-1;
        int p2 = n-1;
        int e1,e2;
        for (int i=nums1.length-1; i>0; i--){
            e1 = p1>=0 ? nums1[p1] : Integer.MIN_VALUE;
            e2 = p2>=0 ? nums2[p2] : Integer.MIN_VALUE;
            if (e1>=e2){
                nums1[i]=e1;
                p1--;
            } else {
                nums1[i] = e2;
                p2--;
            }
        }


    }
}
//arrays sorted in non-decreasing order
// m and n represents the elements in the array
//