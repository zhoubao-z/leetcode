package record_202111;

/**
 * https://leetcode-cn.com/problems/detect-capital/
 * 520. 检测大写字母
 */
public class _1113_detectCapitalUse {
    public static boolean detectCapitalUse(String word) {
        String word1=word.toUpperCase();
        int cnt=0;
        for(int i=0;i<word.length();i++){
            cnt+=word.charAt(i)-word1.charAt(i);
        }
        int n=word.length();
        return cnt==0||cnt==n*32||(cnt==n*32-32&&word.charAt(0)==word1.charAt(0))?true:false;
    }

    public static void main(String[] args) {
        System.out.println(detectCapitalUse("AAA"));
    }
}
