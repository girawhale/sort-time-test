package sort;

import java.util.Arrays;
import java.util.Collections;

public class ArraySort implements SortTest {
    @Override
    public long sort(int[] arr) {
        long start = System.currentTimeMillis();
        Arrays.sort(arr);
        return System.currentTimeMillis() - start;
    }
}
