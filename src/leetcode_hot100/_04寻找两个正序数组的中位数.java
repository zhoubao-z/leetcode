package leetcode_hot100;

public class _04寻找两个正序数组的中位数 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int total = len1 + len2;
        if (total % 2 == 1) {
            int midIdx = total / 2 + 1;
            double mid = getKthElement(nums1, nums2, midIdx);
            return mid;
        } else {
            int midIdx1 = total / 2, midIdx2 = total / 2 + 1;
            double mid = (getKthElement(nums1, nums2, midIdx1) + getKthElement(nums1, nums2, midIdx2)) / 2;
            return mid;
        }
    }

    private double getKthElement(int[] nums1, int[] nums2, int k) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int idx1 = 0, idx2 = 0;
        while (true) {
            if (idx1 == len1) {
                return nums2[idx2 + k - 1];
            }
            if (idx2 == len2) {
                return nums1[idx1 + k - 1];
            }
            if (k == 1) {
                return Math.min(nums1[idx1], nums2[idx2]);
            }
            int half = k / 2;
            int newIdx1 = Math.min(idx1 + half, len1) - 1;
            int newIdx2 = Math.min(idx2 + half, len2) - 1;
            int pivot1 = nums1[newIdx1], pivot2 = nums2[newIdx2];
            if (pivot1 <= pivot2) {
                k -= (newIdx1 - idx1 + 1);
                idx1 = newIdx1 + 1;
            } else {
                k -= (newIdx2 - idx2 + 1);
                idx2 = newIdx2 + 1;
            }
        }
    }


    public static void main(String[] args) {

    }
}
