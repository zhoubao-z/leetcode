package record_202109;

/**
 * 比较版本号
 * https://leetcode-cn.com/problems/compare-version-numbers/
 */
public class _0901_compareVersion {
    public static int compareVersion(String version1, String version2) {
        String[] seq1 = version1.split("\\.");
        String[] seq2 = version2.split("\\.");
        int i = 0;
        int j = 0;
        int num1 = 0;
        int num2 = 0;
        while (i < seq1.length || j < seq2.length) {
            if (i >= seq1.length) {
                num2 = Integer.valueOf(seq2[j]);
                if (num2 != 0) {
                    return -1;
                } else {
                    j++;
                }
                continue;
            }
            if (j >= seq2.length) {
                num1 = Integer.valueOf(seq1[i]);
                if (num1 != 0) {
                    return 1;
                } else {
                    i++;
                }
                continue;
            }
            num1 = Integer.valueOf(seq1[i]);
            num2 = Integer.valueOf(seq2[j]);
            if (num1 > num2) {
                return 1;
            } else if (num1 < num2) {
                return -1;
            } else {
                i++;
                j++;
            }
        }


        return 0;
    }

    public static void main(String[] args) {
        String version1 = "1.0.1";
        String version2 = "1";
        System.out.println(compareVersion(version1, version2));
    }
}
