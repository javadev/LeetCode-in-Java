package g3501_3600.s3522_calculate_score_after_performing_instructions;

// #Medium #Array #String #Hash_Table #Simulation
// #2025_04_22_Time_1_ms_(100.00%)_Space_69.59_MB_(93.20%)

public class Solution {
    public long calculateScore(String[] instructions, int[] values) {
        long ans = 0;
        boolean[] seen = new boolean[instructions.length];
        int pos = 0;
        while (pos >= 0 && pos < instructions.length && !seen[pos]) {
            seen[pos] = true;
            if (instructions[pos].charAt(0) == 'a') {
                ans += values[pos];
                pos++;
            } else {
                pos += values[pos];
            }
        }
        return ans;
    }
}
