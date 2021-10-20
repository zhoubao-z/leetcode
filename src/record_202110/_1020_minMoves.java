package record_202110;

/**
 * 最小操作次数使数组元素相等
 * https://leetcode-cn.com/problems/minimum-moves-to-equal-array-elements/
 */
public class _1020_minMoves {
    public static int minMoves(int[] nums) {
        int ans=0;
        int min=nums[0];
        for(int num:nums){
            min=Math.min(min,num);
        }
        for(int num:nums){
            ans+=(num-min);
        }
        return ans;
    }
    public static void main(String[] args) {
        int ans=minMoves(new int[]{1,2,3});
        System.out.println(ans);
    }
}
