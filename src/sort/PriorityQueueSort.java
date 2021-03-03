package sort;

import java.util.PriorityQueue;

public class PriorityQueueSort implements SortTest {
    @Override
    public long sort(int[] arr) {
        long start = System.currentTimeMillis();
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int a : arr)
            queue.add(a);

        int[] ret = new int[arr.length];
        int idx = 0;
        while (!queue.isEmpty())
            ret[idx++] = queue.poll();

        return System.currentTimeMillis() - start;
    }
}
