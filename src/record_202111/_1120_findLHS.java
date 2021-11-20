package record_202111;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/longest-harmonious-subsequence/
 */
public class _1120_findLHS {
    public static int findLHS(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int ans=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int k=entry.getKey();
            int v=entry.getValue();
            if(map.containsKey(k+1)&&v+map.get(k+1)>ans){
                ans=v+map.get(k+1);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(findLHS(new int[]{1,2,2,1}));
    }
}
