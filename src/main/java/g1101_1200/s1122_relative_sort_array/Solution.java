package g1101_1200.s1122_relative_sort_array;

// #Easy #Array #Hash_Table #Sorting #Counting_Sort
// #2022_03_09_Time_0_ms_(100.00%)_Space_42.7_MB_(39.18%)

public class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] map = new int[1001];
        for (int a : arr1) {
            map[a]++;
        }
        int i = 0;
        for (int b : arr2) {
            while (map[b] != 0) {
                map[b]--;
                arr1[i] = b;
                i++;
            }
        }
        for (int j = 0; j < map.length; j++) {
            while (map[j] != 0) {
                arr1[i] = j;
                map[j]--;
                i++;
            }
        }
        return arr1;
    }
}
