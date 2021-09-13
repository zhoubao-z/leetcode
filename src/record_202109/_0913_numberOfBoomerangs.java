package record_202109;

import javafx.scene.effect.Blend;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 回旋镖的数量
 * https://leetcode-cn.com/problems/number-of-boomerangs/
 */
public class _0913_numberOfBoomerangs {
    public static int numberOfBoomerangs(int[][] points) {
        int count = 0;
        for (int i = 0; i < points.length; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < points.length; j++) {
                if (j != i) {
                    int len = (int) (Math.pow((points[j][0] - points[i][0]), 2) + Math.pow((points[j][1] - points[i][1]), 2));
                    map.put(len, map.getOrDefault(len, 0) + 1);
                }
            }
            for (Integer key : map.keySet()) {
                int num = map.get(key);
                count += num == 1 ? 0 : num * (num - 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] points = {{0, 0}, {0, 2}, {0, 1}, {1, 0}, {2, 0}};
        System.out.println(numberOfBoomerangs(points));

    }
}
