package record_202111;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/reconstruct-original-digits-from-english/
 */
public class _1124_originalDigits {
    static String[] ch = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    static int[] priority = new int[]{0, 8, 6, 3, 2, 7, 5, 9, 4, 1};

    public static String originalDigits(String s) {
        int[] cnts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            cnts[s.charAt(i) - 'a']++;
        }
        StringBuffer buf = new StringBuffer();
        for (int i : priority) {
            int k = Integer.MAX_VALUE;
            for (char c : ch[i].toCharArray()) {
                k = Math.min(k, cnts[c - 'a']);
            }
            for (char c : ch[i].toCharArray()) {
                cnts[c - 'a'] -= k;
            }
            while (k-- > 0) buf.append(i);
        }
        char[] cs = buf.toString().toCharArray();
        Arrays.sort(cs);
        return String.valueOf(cs);
    }

    public static void main(String[] args) {

    }
}
