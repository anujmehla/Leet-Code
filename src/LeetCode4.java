/*
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).
 */


public class LeetCode4 {
    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int[] nums2 = {2};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] sort = new int[nums1.length+nums2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i != nums1.length && j != nums2.length) {
            if (nums1[i] < nums2[j]) {
                sort[k++] = nums1[i++];
            } else if (nums1[i] == nums2[j]) {
                sort[k++] = nums1[i++];
            } else {
                sort[k++] = nums2[j++];
            }
        }
        while (i != nums1.length) {
            sort[k++] = nums1[i++];
        }
        while (j != nums2.length) {
            sort[k++] = nums2[j++];
        }
        print(sort);
        if (sort.length % 2 == 0) {
            int z = sort.length;
            return (sort[z/2]+sort[(z/2)-1])/2.0;
        } else {
            return sort[sort.length / 2];
        }
    }

    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
