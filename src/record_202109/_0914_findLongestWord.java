package record_202109;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 通过删除字母匹配到字典里最长单词
 * https://leetcode-cn.com/problems/longest-word-in-dictionary-through-deleting/
 */
public class _0914_findLongestWord {
    public static String findLongestWord(String s, List<String> dictionary) {
        Collections.sort(dictionary,(s1,s2)->s1.length()!=s2.length()?s2.length()-s1.length():s1.compareTo(s2));
        for(String dic:dictionary){
            if(isMatch(s,dic)){
                return dic;
            }
        }
        return "";
    }

    private static boolean isMatch(String s, String s1) {
        int j=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==s1.charAt(j)){
                j++;
            }
            if(j==s1.length()){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s="mjmqqjrmzkvhxlyruonekhhofpzzslupzojfuoztvzmmqvmlhgqxehojfowtrinbatjujaxekbcydldglkbxsqbbnrkhfdnpfbuaktupfftiljwpgglkjqunvithzlzpgikixqeuimmtbiskemplcvljqgvlzvnqxgedxqnznddkiujwhdefziydtquoudzxstpjjitmiimbjfgfjikkjycwgnpdxpeppsturjwkgnifinccvqzwlbmgpdaodzptyrjjkbqmgdrftfbwgimsmjpknuqtijrsnwvtytqqvookinzmkkkrkgwafohflvuedssukjgipgmypakhlckvizmqvycvbxhlljzejcaijqnfgobuhuiahtmxfzoplmmjfxtggwwxliplntkfuxjcnzcqsaagahbbneugiocexcfpszzomumfqpaiydssmihdoewahoswhlnpctjmkyufsvjlrflfiktndubnymenlmpyrhjxfdcq";
        String[] dictionary = {"ale", "apple", "monkey", "plea","applf","bpple","appla","ettphsiunoglotjlccurlre","ntgcykxhdfescxxypyew"};

//        System.out.println(findLongestWord(s,Arrays.asList(dictionary)));
        System.out.println(isMatch("abc","abc"));
    }
}
