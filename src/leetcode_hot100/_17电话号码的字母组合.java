package leetcode_hot100;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _17电话号码的字母组合 {
    public static List<String> letterCombinations(String digits) {
        List<String> results = new ArrayList<>();
        if (digits.length() == 0) {
            return results;
        }
        Map<Character, String> letterMap = new HashMap<>();
        letterMap.put('2', "abc");
        letterMap.put('3', "def");
        letterMap.put('4', "ghi");
        letterMap.put('5', "jkl");
        letterMap.put('6', "mno");
        letterMap.put('7', "pqrs");
        letterMap.put('8', "tuv");
        letterMap.put('9', "wxyz");
        backtrack(results, letterMap, 0, digits, new StringBuffer());
        return results;
    }

    private static void backtrack(List<String> results, Map<Character, String> letterMap, int t, String digits, StringBuffer buffer) {
        if (t == digits.length()) {
            results.add(buffer.toString());
        } else {
            String letters = letterMap.get(digits.charAt(t));
            for (int i = 0; i < letters.length(); i++) {
                buffer.append(letters.charAt(i));
                backtrack(results,letterMap,t+1,digits,buffer);
                buffer.deleteCharAt(t);
            }
        }
    }

    public static void main(String[] args) {
        List<String> results=letterCombinations("234");
        for(int i=0;i<results.size();i++){
            System.out.println(results.get(i));
        }
    }
}
