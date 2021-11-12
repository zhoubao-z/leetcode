package record_202111;

/**
 * https://leetcode-cn.com/problems/guess-number-higher-or-lower-ii/
 * 375. 猜数字大小 II
 */
public class _1112_getMoneyAmount {
    public static int getMoneyAmount(int n) {
        int[][] f=new int[n+1][n+1];
        for(int j=1;j<=n;j++){
            for(int i=j-1;i>=1;i--){
                int minCost=Integer.MAX_VALUE;
                for(int k=i;k<j;k++){
                    int cost=Math.max(f[i][k-1],f[k+1][j])+k;
                    minCost=Math.min(minCost,cost);
                }
                f[i][j]=minCost;
            }
        }
        return f[1][n];
    }

    public static void main(String[] args) {
        System.out.println(getMoneyAmount(10));;
    }
}
