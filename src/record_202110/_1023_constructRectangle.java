package record_202110;

/**
 * https://leetcode-cn.com/problems/construct-the-rectangle/
 * 492. 构造矩形
 */
public class _1023_constructRectangle {
    public int[] constructRectangle(int area) {
        int w = (int) Math.sqrt(area);
        while (area % w != 0) {
            --w;
        }
        return new int[]{area / w, w};
    }

    public static void main(String[] args) {

    }
}
