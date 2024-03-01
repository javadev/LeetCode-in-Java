package g2101_2200.s2120_execution_of_all_suffix_instructions_staying_in_a_grid;

// #Medium #String #Simulation #2022_06_02_Time_31_ms_(88.00%)_Space_42.6_MB_(85.71%)

@SuppressWarnings("java:S135")
public class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int[] answer = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            int currX = startPos[0];
            int currY = startPos[1];
            for (int j = i; j < s.length(); j++) {
                char mv = s.charAt(j);
                if (mv == 'R') {
                    currY++;
                    if (currY > n - 1) {
                        break;
                    }
                } else if (mv == 'D') {
                    currX++;
                    if (currX > n - 1) {
                        break;
                    }
                } else if (mv == 'L') {
                    currY--;
                    if (currY < 0) {
                        break;
                    }
                } else if (mv == 'U') {
                    currX--;
                    if (currX < 0) {
                        break;
                    }
                }
                count++;
            }
            answer[i] = count;
        }
        return answer;
    }
}
