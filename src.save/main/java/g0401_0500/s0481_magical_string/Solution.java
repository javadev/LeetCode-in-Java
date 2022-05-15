package g0401_0500.s0481_magical_string;

// #Medium #String #Two_Pointers #Acceptance_49.8%
// #2022_03_18_Time_5_ms_(88.46%)_Space_43.2_MB_(34.62%)

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
