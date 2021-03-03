package sort;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort implements SortTest {
    @Override
    public long sort(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int a : arr)
            list.add(a);

        long start = System.currentTimeMillis();
        Collections.sort(list);
        return System.currentTimeMillis() - start;
    }
}
