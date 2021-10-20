package record_202110;
/**
 *https://leetcode-cn.com/problems/fraction-to-recurring-decimal/
 */

import java.util.HashMap;
import java.util.Map;

public class _1003_fractionToDecimal {
    public static String fractionToDecimal(int numerator, int denominator) {
        long num = numerator;
        long dem = denominator;
        if (num % dem == 0) {
            return String.valueOf(num / dem);
        }
        StringBuffer sb = new StringBuffer();
        if (num * dem < 0) {
            sb.append("-");
        }
        num = Math.abs(num);
        dem = Math.abs(dem);
        sb.append(String.valueOf(num / dem) + ".");
        num %= dem;
        Map<Long, Integer> map = new HashMap<>();
        while (num != 0) {
            map.put(num, sb.length());
            num *= 10;
            sb.append(num / dem);
            num %= dem;
            if (map.containsKey(num)) {
                int u = map.get(num);
                return String.format("%s(%s)", sb.substring(0, u), sb.substring(u));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(fractionToDecimal(4,33));
    }
}
