package sort;


import java.util.Map;
import java.util.TreeMap;

public class TreeMapSort implements SortTest {
    @Override
    public long sort(int[] arr) {
        long start = System.currentTimeMillis();

        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int a : arr)
            map.put(a, map.getOrDefault(a, 0) + 1);

        int[] ret = new int[arr.length];
        int idx = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++)
                ret[idx++] = entry.getKey();
        }

        return System.currentTimeMillis() - start;
    }
}
