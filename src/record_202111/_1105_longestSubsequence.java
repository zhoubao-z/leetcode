package record_202111;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/longest-arithmetic-subsequence-of-given-difference/
 * 1218. 最长定差子序列
 *
 */
public class _1105_longestSubsequence {
    public static int longestSubsequence(int[] arr, int difference) {
       int ans=0;
       Map<Integer,Integer> dp=new HashMap<>();
       for(int num:arr){
           dp.put(num,dp.getOrDefault(num-difference,0)+1);
           ans=Math.max(ans,dp.get(num));
       }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={1,5,7,8,5,3,4,2,1};
        System.out.println(longestSubsequence(arr,-2));
    }
}
