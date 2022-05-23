package leetcode_hot100;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _01两数之和 {
    public int[] twoSum(int[] nums, int target) {

       Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target-nums[i])){
                return new int[]{i,map.get(target-nums[i])};
            }
            map.put(nums[i],i);
        }
        return new int[2];
    }

    public static void main(String[] args) {

    }
}
