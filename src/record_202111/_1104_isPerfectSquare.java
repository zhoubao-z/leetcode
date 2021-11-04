package record_202111;

/**
 * https://leetcode-cn.com/problems/valid-perfect-square/
 * 367. 有效的完全平方数
 */
public class _1104_isPerfectSquare {
    public static boolean isPerfectSquare(int num) {
        if (num == 1) return true;
        int left = 1;
        int right = num;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long square=(long)mid*mid;
            if (square == num) {
                return true;
            } else if (square > num) {
                right = mid - 1;
            } else{
                left = mid + 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println(isPerfectSquare(4));
    }
}
