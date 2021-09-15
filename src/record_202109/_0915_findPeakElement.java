package record_202109;

/**
 * 寻找峰值
 * https://leetcode-cn.com/problems/find-peak-element/
 */
public class _0915_findPeakElement {
    public static int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(findPeakElement(nums));
    }
}
