package g2601_2700.s2657_find_the_prefix_common_array_of_two_arrays;

// #Medium #Array #Hash_Table #2023_09_07_Time_2_ms_(99.04%)_Space_44.2_MB_(94.23%)

public class Solution {
    public int[] findThePrefixCommonArray(int[] a, int[] b) {
        int[] result = new int[51];
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            result[a[i]]++;
            if (result[a[i]] == 2) {
                counter++;
            }
            result[b[i]]++;
            if (result[b[i]] == 2) {
                counter++;
            }
            a[i] = counter;
        }
        return a;
    }
}
