package g0201_0300.s0264_ugly_number_ii;

// #Medium #Hash_Table #Dynamic_Programming #Math #Heap_Priority_Queue #Dynamic_Programming_I_Day_11
// #2022_07_05_Time_2_ms_(99.91%)_Space_41.3_MB_(91.38%)

public class Solution {
    public int nthUglyNumber(int n) {
        int[] ugly = new int[n];
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        int ugly2 = 2;
        int ugly3 = 3;
        int ugly5 = 5;
        int nextugly;
        ugly[0] = 1;
        for (int i = 1; i < n; i++) {
            nextugly = Math.min(Math.min(ugly2, ugly3), ugly5);
            ugly[i] = nextugly;
            if (nextugly == ugly2) {
                i2++;
                ugly2 = ugly[i2] * 2;
            }
            if (nextugly == ugly3) {
                i3++;
                ugly3 = ugly[i3] * 3;
            }
            if (nextugly == ugly5) {
                i5++;
                ugly5 = ugly[i5] * 5;
            }
        }
        return ugly[n - 1];
    }
}
