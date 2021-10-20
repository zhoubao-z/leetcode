package record_202110;

/**
 * https://leetcode-cn.com/problems/arranging-coins/
 */
public class _1010_arrangeCoins {

    public int arrangeCoins(int n) {
        int left = 1, right = n;
        while (left < right) {
            int mid = (right - left + 1) / 2 + left;
            if ((long) mid * (mid + 1) <= (long) 2 * n) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {

    }
}
