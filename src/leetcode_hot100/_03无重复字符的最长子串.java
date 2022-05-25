package leetcode_hot100;

import java.util.HashMap;
import java.util.Map;

public class _03无重复字符的最长子串 {
    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        int left = 0;
        int right = 0;
        while (right < s.length()) {
            if (!map.containsKey(s.charAt(right))) {
                map.put(s.charAt(right), right);
            } else {
                max = Math.max(max, right - left);
                for (int i = left; i < map.get(s.charAt(right)); i++) {
                    map.remove(s.charAt(i));
                }
                left = map.get(s.charAt(right)) + 1;
                map.put(s.charAt(right), right);
            }
            right++;
        }

        return Math.max(max,map.size());
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("deabcabcbb"));
    }
}
