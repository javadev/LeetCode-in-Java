package g1401_1500.s1404_number_of_steps_to_reduce_a_number_in_binary_representation_to_one;

// #Medium #String #Bit_Manipulation #2022_03_25_Time_1_ms_(62.90%)_Space_42.3_MB_(26.70%)

public class Solution {
    public int numSteps(String s) {
        int steps = 0;
        int carry = 0;
        for (int i = s.length() - 1; i >= 1; i--) {
            if (carry == 0) {
                if (s.charAt(i) == '1') {
                    steps += 2;
                    carry = 1;
                } else {
                    steps++;
                }
            } else {
                if (s.charAt(i) == '0') {
                    steps += 2;
                } else {
                    steps++;
                }
            }
        }
        return steps + carry;
    }
}
