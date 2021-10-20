package record_202110;

/**
 * https://leetcode-cn.com/problems/count-and-say/
 * 外观数列
 */
public class _1015_countAndSay {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        String str = countAndSay(n - 1);
        StringBuffer sb = new StringBuffer();
        int s = 0;
        for (int j = 1; j <= str.length(); j++) {
            if (j == str.length()) {
                sb.append(j - s).append(str.charAt(s));
            } else if (str.charAt(j) != str.charAt(s)) {
                sb.append(j - s).append(str.charAt(s));
                s = j;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

    }
}
