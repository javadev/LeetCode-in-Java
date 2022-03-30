package g0901_1000.s0969_pancake_sorting;

// #Medium #Array #Sorting #Greedy #Two_Pointers

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> result = new ArrayList<>();
        for (int i = arr.length; i >= 1; i--) {
            int max = Integer.MIN_VALUE;
            int index = 0;
            for (int j = 0; j < i; j++) {
                if (max < arr[j]) {
                    index = j + 1;
                    max = arr[j];
                }
            }
            result.add(index);
            reverse(arr, index - 1);
            result.add(i);
            reverse(arr, i - 1);
        }
        return result;
    }

    private void reverse(int[] arr, int index) {
        for (int i = 0; i <= (index - 1) / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[index - i];
            arr[index - i] = temp;
        }
    }
}
