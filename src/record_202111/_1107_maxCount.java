package record_202111;

/**
 * https://leetcode-cn.com/problems/range-addition-ii/
 * 598. 范围求和 II
 */
public class _1107_maxCount {
    public static int maxCount(int m, int n, int[][] ops) {
        int a=m;
        int b=n;
        for(int[] op:ops){
            a=Math.min(a,op[0]);
            b=Math.min(b,op[1]);
        }
        return a*b;
    }
    public static void main(String[] args) {
       int m = 3, n = 3;
        int[][] operations = {{2,2},{3,3}};
        System.out.println(maxCount(m,n,operations));
    }
}
