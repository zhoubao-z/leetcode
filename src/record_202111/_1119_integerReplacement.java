package record_202111;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/integer-replacement/
 * 397. 整数替换
 */
public class _1119_integerReplacement {
    static Map<Integer, Integer> map = new HashMap<>();

    public static int integerReplacement(int n) {
        if (n == 1) return 0;
        if (!map.containsKey(n)) {
            if (n % 2 == 0) {
                map.put(n, 1 + integerReplacement(n / 2));
            } else {
                map.put(n, 2 + Math.min(integerReplacement(n / 2), integerReplacement(n / 2 + 1)));
            }
        }
        return (int) map.get(n);
    }

    public static void main(String[] args) {
        System.out.println(integerReplacement(2147483647));
        System.out.println(Math.pow(2, 31) - 1);
    }
}
