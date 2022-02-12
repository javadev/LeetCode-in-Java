package g0901_1000.s0905_sort_array_by_parity;

// #Easy #Array #Sorting #Two_Pointers

public class Solution {
    public int[] sortArrayByParity(int[] a) {
        for (int i = 0, j = a.length - 1; i < j; i++) {
            if (a[i] % 2 != 0) {
                while (j > i && a[j] % 2 != 0) {
                    j--;
                }
                swap(a, i, j);
            }
        }
        return a;
    }

    private void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
