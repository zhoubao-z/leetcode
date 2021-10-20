package record_202110;

/**
 * https://leetcode-cn.com/problems/divide-two-integers/
 */
public class _1012_divide {
    public int divide(int dividend, int divisor) {
        if (divisor == 1) {
            return dividend;
        }
        if (divisor == -1) {
            if (dividend > Integer.MIN_VALUE) return -dividend;
            else return Integer.MAX_VALUE;
        }

        int sign = 1;
        if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)) {
            sign = -1;
        }
        if (dividend > 0) {
            dividend = -dividend;
        }
        if (divisor > 0) {
            divisor = -divisor;
        }

        int pow = 1;
        int trun = 0;
        int count = divisor;
        while (dividend <= divisor) {
            count = divisor;
            pow = 1;
            while (true) {
                if (dividend - count >= count) {
                    break;
                }
                count += count;
                pow += pow;
            }
            trun += pow;
            dividend -= count;

        }

        if (sign == 1) {
            return trun;
        } else {
            return -trun;
        }

    }

    public static void main(String[] args) {

    }
}
