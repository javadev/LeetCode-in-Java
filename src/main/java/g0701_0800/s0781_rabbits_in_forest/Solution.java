package g0701_0800.s0781_rabbits_in_forest;

// #Medium #Array #Hash_Table #Math #Greedy #2022_03_26_Time_1_ms_(99.15%)_Space_41.4_MB_(92.53%)

public class Solution {
    public int numRabbits(int[] answers) {
        int[] counts = new int[1001];
        for (int element : answers) {
            counts[element]++;
        }
        int answer = counts[0];
        for (int i = 1; i <= 1000; i++) {
            if (counts[i] > 0) {
                int rabbitsInPartialGroup = counts[i] % (i + 1);
                int rabbitsInCompleteGroups = counts[i] - rabbitsInPartialGroup;
                answer += rabbitsInCompleteGroups;
                if (rabbitsInPartialGroup > 0) {
                    answer += (i + 1);
                }
            }
        }
        return answer;
    }
}
