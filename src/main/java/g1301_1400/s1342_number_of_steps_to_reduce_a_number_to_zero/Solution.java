package g1301_1400.s1342_number_of_steps_to_reduce_a_number_to_zero;

// #Easy #Math #Bit_Manipulation #2022_03_19_Time_1_ms_(58.49%)_Space_41_MB_(43.29%)

public class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num--;
            }
            steps++;
        }
        return steps;
    }
}
