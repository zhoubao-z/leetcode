package leetcode_hot100;

import java.util.ArrayList;
import java.util.List;

public class _22括号生成 {
    public List<String> generateParenthesis(int n) {
        List<String> results=new ArrayList<>();
        backtrack(results,new StringBuffer(),0,0,n);
        return results;
    }

    private void backtrack(List<String> results, StringBuffer buffer, int open, int close, int n) {
        if(buffer.length()==2*n){
            results.add(buffer.toString());
            return;
        }
        if(open<n){
            buffer.append("(");
            backtrack(results,buffer,open+1,close,n);
            buffer.deleteCharAt(buffer.length()-1);
        }
        if(open>close){
            buffer.append(")");
            backtrack(results,buffer,open,close+1,n);
            buffer.deleteCharAt(buffer.length()-1);
        }
    }
}
