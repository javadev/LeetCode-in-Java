package g1801_1900.s1819_number_of_different_subsequences_gcds;

// #Hard #Array #Math #Counting #Number_Theory
// #2022_05_03_Time_116_ms_(96.43%)_Space_51.1_MB_(100.00%)

public class Solution {
    public int countDifferentSubsequenceGCDs(int[] nums) {
        int max = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        boolean[] present = new boolean[200001];
        for (int num : nums) {
            max = Math.max(max, num);
            present[num] = true;
        }
        int count = 0;
        for (int i = 1; i <= max; i++) {
            if (present[i]) {
                count++;
                continue;
            }
            int tempGcd = 0;
            for (int j = i; j <= max; j += i) {
                if (present[j]) {
                    tempGcd = gcd(tempGcd, j);
                }
                if (tempGcd == i) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
