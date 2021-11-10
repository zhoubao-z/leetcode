package record_202111;

/**
 * https://leetcode-cn.com/problems/teemo-attacking/
 * 495. 提莫攻击
 */
public class _1110_findPoisonedDuration {
    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        int cnt=duration;

        for(int i=1;i<timeSeries.length;i++){
            cnt+=Math.min(timeSeries[i]-timeSeries[i-1],duration);
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] timeSeries = {1,2};
        int duration = 2;
        System.out.println(findPoisonedDuration(timeSeries,duration));
    }
}
