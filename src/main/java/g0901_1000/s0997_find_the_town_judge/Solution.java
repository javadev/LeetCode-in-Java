package g0901_1000.s0997_find_the_town_judge;

// #Easy #Array #Hash_Table #Graph

public class Solution {
    public int findJudge(int n, int[][] trust) {
        if (trust.length < n - 1) {
            return -1;
        }
        int[] trustScores = new int[n];
        for (int[] t : trust) {
            trustScores[t[1] - 1]++;
            trustScores[t[0] - 1]--;
        }
        for (int i = 0; i < n; i++) {
            if (trustScores[i] == n - 1) {
                return i + 1;
            }
        }
        return -1;
    }
}
