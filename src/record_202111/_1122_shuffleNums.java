package record_202111;

import java.util.*;

/**
 * https://leetcode-cn.com/problems/shuffle-an-array/
 */
public class _1122_shuffleNums {

    public static void main(String[] args) {
        Solution solution = new Solution(new int[]{1, 2, 3});
        int[] nums=solution.reset();
        for(int num:nums){
            System.out.print(num+", ");
        }
        System.out.println();
        nums=solution.shuffle();
        for(int num:nums){
            System.out.print(num+", ");
        }
        nums=solution.reset();
        for(int num:nums){
            System.out.print(num+", ");
        }
    }
}
class Solution {
    int[] nums;
    int[] original;

    public Solution(int[] nums) {
        this.nums = nums;
        this.original = new int[nums.length];
        System.arraycopy(nums, 0, original, 0, nums.length);
    }

    public int[] reset() {
        System.arraycopy(original, 0, nums, 0, nums.length);
        return nums;
    }

    public int[] shuffle() {
        Random random = new Random();
        for (int i = 0; i < nums.length; ++i) {
            int j = i + random.nextInt(nums.length - i);
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        return nums;
    }
}
