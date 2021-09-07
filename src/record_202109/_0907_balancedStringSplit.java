package record_202109;

import java.util.Stack;

/**
 * 分割平衡字符串
 * https://leetcode-cn.com/problems/split-a-string-in-balanced-strings/
 */
public class _0907_balancedStringSplit {

    public static int balancedStringSplit(String s) {
        int result=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L'){
                count++;
            }else if(s.charAt(i)=='R'){
                count--;
            }
            if(count==0){
              result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s="RLRRLLRLRL";
        System.out.println(balancedStringSplit(s));
    }
}
