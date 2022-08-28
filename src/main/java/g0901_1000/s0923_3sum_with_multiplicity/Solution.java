package g0901_1000.s0923_3sum_with_multiplicity;

// #Medium #Array #Hash_Table #Sorting #Two_Pointers #Counting
// #2022_03_29_Time_14_ms_(69.20%)_Space_44.2_MB_(48.00%)

public class Solution {
    private static final int MOD = (int) 1e9 + 7;
    private static final int MAX = 100;

    public int threeSumMulti(int[] arr, int target) {
        int answer = 0;
        int[] countRight = new int[MAX + 1];
        for (int num : arr) {
            ++countRight[num];
        }
        int[] countLeft = new int[MAX + 1];
        for (int j = 0; j < arr.length - 1; j++) {
            --countRight[arr[j]];
            int remains = target - arr[j];
            if (remains <= 2 * MAX) {
                for (int v = 0; v <= Math.min(remains, MAX); v++) {
                    if (remains - v <= MAX) {
                        int count = countRight[v] * countLeft[remains - v];
                        if (count > 0) {
                            answer = (answer + count) % MOD;
                        }
                    }
                }
            }
            ++countLeft[arr[j]];
        }
        return answer;
    }
}
