package record_202109;

import java.util.Stack;

/**
 * 有效的括号字符串
 * https://leetcode-cn.com/problems/valid-parenthesis-string/
 */
public class _0912_checkValidString {
    public static boolean checkValidString(String s) {
        Stack<Integer> stack1=new Stack<>();
        Stack<Integer> stack2=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                stack2.add(i);
            }else if(s.charAt(i)=='('){
                stack1.add(i);
            }else{
                if(!stack1.isEmpty()){
                    stack1.pop();
                }else{
                    if(!stack2.isEmpty()){
                        stack2.pop();
                    }else {
                        return false;
                    }
                }
            }
        }
        while(!stack1.isEmpty()){
            int i=stack1.pop();
            if(!stack2.isEmpty()){
                int j=stack2.pop();
                if(i>j) return false;
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s="(((((*(()((((*((**(((()()*)()()()*((((**)())*)*)))))))(())(()))())((*()()(((()((()*(())*(()**)()(())";
//        String s="(((((*(((((*((**(((*)*((((**))*)*)))))))))((*(((((**(**)";

        System.out.println(checkValidString(s));
    }
}
