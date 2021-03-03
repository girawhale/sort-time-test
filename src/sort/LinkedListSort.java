package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListSort implements SortTest {
    @Override
    public long sort(int[] arr) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int a : arr)
            list.add(a);

        long start = System.currentTimeMillis();
        Collections.sort(list);
        return System.currentTimeMillis() - start;
    }
}
