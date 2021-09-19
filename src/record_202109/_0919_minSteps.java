package record_202109;

/**
 * 只有两个键的键盘
 * https://leetcode-cn.com/problems/2-keys-keyboard/
 */
public class _0919_minSteps {
    public static int minSteps(int n){
        int[] dp=new int[n+1];
        for(int i=2;i<=n;i++){
            dp[i]=Integer.MAX_VALUE;
            for(int j=1;j*j<=i;j++){
                if(i%j==0){
                    dp[i]=Math.min(dp[i],dp[j]+i/j);
                    dp[i]=Math.min(dp[i],dp[i/j]+j);

                }
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        System.out.println(minSteps(6));
    }
}
