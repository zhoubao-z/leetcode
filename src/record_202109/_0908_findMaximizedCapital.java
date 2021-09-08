package record_202109;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class _0908_findMaximizedCapital {
    public static int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int[][] arr = new int[profits.length][2];
        for (int i = 0; i < profits.length; i++) {
            arr[i][0] = capital[i];
            arr[i][1] = profits[i];

        }
        Arrays.sort(arr, (o1, o2) -> {
            return o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0];
        });
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> {
            return o2 - o1;
        });
        int curr = 0;
        for (int i = 0; i < k; i++) {
            while (curr < profits.length && arr[curr][0] <= w) {
                priorityQueue.add(arr[curr][1]);
                curr++;
            }
            if (!priorityQueue.isEmpty()) {
                w += priorityQueue.poll();
            } else {
                break;
            }
        }
        return w;
    }


    public static void main(String[] args) {
        int k = 1;
        int w = 0;
        int[] profits = {3, 1, 2, 2};
        int[] capital = {1, 0, 0, 1};
        System.out.println(findMaximizedCapital(k, w, profits, capital));
    }
}
