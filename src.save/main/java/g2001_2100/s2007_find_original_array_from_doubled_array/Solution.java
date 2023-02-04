package g2001_2100.s2007_find_original_array_from_doubled_array;

// #Medium #Array #Hash_Table #Sorting #Greedy
// #2022_05_23_Time_41_ms_(96.48%)_Space_134.5_MB_(42.43%)

public class Solution {
    public int[] findOriginalArray(int[] changed) {
        if (changed.length % 2 == 1) {
            return new int[0];
        }
        int[] a = new int[100001];
        for (int j : changed) {
            a[j]++;
        }
        if (a[0] % 2 == 1) {
            return new int[0];
        }
        int[] ans = new int[changed.length / 2];
        int p = 0;
        if (a[0] > 0) {
            a[0] /= 2;
            while (a[0] > 0) {
                ans[p++] = 0;
                a[0]--;
            }
        }
        for (int i = 1; i <= 100001 / 2; i++) {
            if (a[i] == 0) {
                continue;
            }
            int tmp = i * 2;
            if (a[tmp] >= a[i]) {
                a[tmp] = a[tmp] - a[i];
                while (a[i] > 0) {
                    ans[p++] = i;
                    a[i]--;
                }
            } else {
                return new int[0];
            }
        }
        for (int i = 1; i < a.length; i++) {
            if (a[i] != 0) {
                return new int[0];
            }
        }
        return ans;
    }
}
