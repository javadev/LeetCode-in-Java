package g0401_0500.s0481_magical_string;

// #Medium #String #Two_Pointers #2022_07_20_Time_5_ms_(93.33%)_Space_43_MB_(50.00%)

public class Solution {
    public int magicalString(int n) {
        int[] a = new int[n + 2];
        int fast = 1;
        int slow = 1;
        int num = 1;
        while (fast <= n) {
            a[fast++] = num;
            if (a[slow++] == 2) {
                a[fast++] = num;
            }
            num = 3 - num;
        }
        int count = 0;
        for (int j = 1; j <= n; j++) {
            if (a[j] == 1) {
                count++;
            }
        }
        return count;
    }
}
