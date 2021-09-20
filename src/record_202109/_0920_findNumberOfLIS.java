package record_202109;

import java.util.Arrays;

public class _0920_findNumberOfLIS {
    public static int findNumberOfLIS(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        int[] cnt=new int[n];
        int max=0;
        int ans=0;
        Arrays.fill(dp,1);
        Arrays.fill(cnt,1);
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                   if(dp[j]+1>dp[i]){
                       dp[i] = dp[j] + 1;
                       cnt[i] = cnt[j];
                   }else if(dp[j]+1==dp[i]){
                       cnt[i]+=cnt[j];
                   }
                }
            }
            if(dp[i]>max){
                max=dp[i];
                ans=cnt[i];
            }else if(dp[i]==max){
                ans+=cnt[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums={1,3,5,4,7};
        System.out.println(findNumberOfLIS(nums));
    }
}
