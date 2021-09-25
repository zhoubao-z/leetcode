package record_202109;

import java.util.Arrays;

/**
 * 两个字符串的删除操作
 * https://leetcode-cn.com/problems/delete-operation-for-two-strings/
 */
public class _0925_minDistance {
    static int[][] memo;

    public static int minDistance(String word1, String word2) {
        memo = new int[word1.length()][word2.length()];
        for (int[] arr : memo) {
            Arrays.fill(arr, -1);
        }

        int lcs = LCS(word1, 0, word2, 0);
        return word1.length() + word2.length() - 2 * lcs;
    }

    private static int LCS(String word1, int m, String word2, int n) {
        if (m == word1.length() || n == word2.length()) {
            return 0;
        }
        if (memo[m][n] != -1) {
            return memo[m][n];
        }
        if (word1.charAt(m) == word2.charAt(n)) {
            memo[m][n] = 1 + LCS(word1, m + 1, word2, n + 1);
        } else {
            memo[m][n] = Math.max(LCS(word1, m, word2, n + 1), LCS(word1, m + 1, word2, n));
        }
        return memo[m][n];

    }

    public static void main(String[] args) {
        String word1 = "dinitrophenylhydrazine";
        String word2 = "acetylphenylhydrazine";
        System.out.println(minDistance(word1, word2));
    }
}
