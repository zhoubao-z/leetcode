package record_202109;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Random;

public class _0903_smallestK {
    //大根堆排序
    public static int[] smallestK(int[] arr, int k) {
        int[] result = new int[k];
        if (k == 0) {
            return result;
        }
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> o2 - o1);

        for (int i = 0; i < k; i++) {
            priorityQueue.add(arr[i]);
        }
        for (int i = k; i < arr.length; i++) {
            if (priorityQueue.peek() > arr[i]) {
                priorityQueue.poll();
                priorityQueue.add(arr[i]);
            }
        }
        for (int i = 0; i < k; i++) {
            result[i] = priorityQueue.poll();
        }
        return result;
    }

    //快排
    public static int[] smallestK2(int[] arr, int k) {
        randomizedSelected(arr, 0, arr.length - 1, k);
        int[] vec = new int[k];
        for (int i = 0; i < k; ++i) {
            vec[i] = arr[i];
        }
        return vec;
    }

    private static void randomizedSelected(int[] arr, int left, int right, int k) {
        if (left>= right) {
            return;
        }
        int pos = randomizedPartition(arr, left, right);
        int num = pos - left+ 1;
        if (k == num) {
            return;
        } else if (k < num) {
            randomizedSelected(arr, left, pos - 1, k);
        } else {
            randomizedSelected(arr, pos + 1, right, k - num);
        }
    }

    // 基于随机的划分
    private static int randomizedPartition(int[] nums, int left, int right) {
        int i = new Random().nextInt(right - left+ 1) + left;
        swap(nums, right, i);
        return partition(nums, left, right);
    }

    private static int partition(int[] nums, int left, int right) {
        int pivot = nums[right];
        int i = left- 1;
        for (int j = left; j <= right - 1; ++j) {
            if (nums[j] <= pivot) {
                i = i + 1;
                swap(nums, i, j);
            }
        }
        swap(nums, i + 1, right);
        return i + 1;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{4, 5, 3, 2, 1, 9, 10, 6};
        int[] result = smallestK2(arr, 4);
        for (int res : result) {
            System.out.println(res);
        }
    }
}
