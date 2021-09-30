package record_202109;

import java.util.Arrays;

/**
 * 超级洗衣机
 * https://leetcode-cn.com/problems/super-washing-machines/
 */
public class _0929_findMinMoves {
    public int findMinMoves(int[] machines) {
        int tot = Arrays.stream(machines).sum();
        int n = machines.length;
        if (tot % n != 0) {
            return -1;
        }
        int avg = tot / n;
        int ans = 0, sum = 0;
        for (int num : machines) {
            num -= avg;
            sum += num;
            ans = Math.max(ans, Math.max(Math.abs(sum), num));
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
