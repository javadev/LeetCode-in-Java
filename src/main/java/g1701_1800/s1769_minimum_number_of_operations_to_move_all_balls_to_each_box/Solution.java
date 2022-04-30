package g1701_1800.s1769_minimum_number_of_operations_to_move_all_balls_to_each_box;

// #Medium #Array #String #2022_04_30_Time_3_ms_(91.66%)_Space_47.8_MB_(35.95%)

public class Solution {
    public int[] minOperations(String boxes) {
        int countFromLeft = 0;
        int countFromRight = 0;
        int moves = 0;
        int[] result = new int[boxes.length()];
        for (char c : boxes.toCharArray()) {
            moves += countFromLeft;
            if (c == '1') {
                countFromLeft++;
            }
        }
        for (int i = boxes.length() - 1; i >= 0; i--) {
            char c = boxes.charAt(i);
            result[i] = moves;
            if (c == '1') {
                countFromLeft--;
                countFromRight++;
            }
            moves -= countFromLeft;
            moves += countFromRight;
        }
        return result;
    }
}
