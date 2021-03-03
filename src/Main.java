import sort.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/data/1.txt"));
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        SortTest test = new PriorityQueueSort();
        double sum = 0;
        for (int i = 1; i <= 10; i++) {
            long tmp = test.sort(arr.clone());
            System.out.println(i + "번째 : " + tmp + "ms");
            sum += tmp;
        }

        System.out.println("******************");
        System.out.println("평균 : " + sum / 10 + "ms");
    }
}
