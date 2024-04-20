package g1401_1500.s1471_the_k_strongest_values_in_an_array;

// #Medium #Array #Sorting #Two_Pointers #2022_03_29_Time_37_ms_(88.20%)_Space_81.7_MB_(70.81%)

import java.util.Arrays;

public class Solution {
    public int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int[] array = new int[k];
        int median = arr[(arr.length - 1) / 2];
        int start = 0;
        int end = arr.length - 1;
        for (int i = 0; i < k; i++) {
            if (Math.abs(arr[end] - median) >= Math.abs(arr[start] - median)) {
                array[i] = arr[end];
                end -= 1;
            } else {
                array[i] = arr[start];
                start += 1;
            }
        }
        return array;
    }
}
