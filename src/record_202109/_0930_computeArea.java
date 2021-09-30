package record_202109;

/**
 *
 */
public class _0930_computeArea {
    public static int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int x1 = Math.max(ax1, bx1);
        int y1 = Math.max(ay1, by1);
        int x2 = Math.min(ax2, bx2);
        int y2 = Math.min(ay2, by2);
        return (ax2-ax1)*(ay2-ay1)+(bx2-bx1)*(by2-by1)-Math.max((x2 - x1),0) * Math.max((y2 - y1),0);
    }

    public static void main(String[] args) {
        int ax1 = -2;
        int ay1 = -2;
        int ax2 = 2;
        int ay2 = 2;
        int bx1 = 1;
        int by1 = 1;
        int bx2 = 3;
        int by2 = 3;
        System.out.println(computeArea(ax1, ay1, ax2, ay2, bx1, by1, bx2, by2));
    }
}
