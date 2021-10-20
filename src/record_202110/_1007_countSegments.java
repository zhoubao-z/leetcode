package record_202110;

/**
 * https://leetcode-cn.com/problems/number-of-segments-in-a-string/
 */
public class _1007_countSegments {
    public int countSegments(String s) {
        if(s.length()==0) return 0;
        int cnt=0;
        for(int i=0;i<s.length();i++){
            if((i==0||s.charAt(i-1)==' ')&&s.charAt(i)!=' '){
                cnt++;
            }
        }
        return cnt;
    }
}
