package record_202109;

/**
 *  最后一个单词的长度
 *  https://leetcode-cn.com/problems/length-of-last-word/
 */
public class _0921_lengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '&&count!=0){
                return count;
            }
            if(s.charAt(i)==' '&&count==0){
                continue;
            }
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }
}
