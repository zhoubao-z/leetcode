package record_202111;

/**
 * https://leetcode-cn.com/problems/poor-pigs/
 */
public class _1125_poorPigs {
    public static int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        if (buckets == 1) return 0;
        int n = minutesToTest / minutesToDie + 1;
        if (buckets <= n) return 1;
        int m = n;
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            if (m >= buckets) return i;
            m = m * n;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(poorPigs(4, 15, 30));
    }
}
