package g0401_0500.s0466_count_the_repetitions;

// #Hard #String #Dynamic_Programming #2022_07_19_Time_1_ms_(100.00%)_Space_42.4_MB_(23.19%)

public class Solution {
    public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
        int n = s2.length();
        char[] ss1 = s1.toCharArray();
        char[] ss2 = s2.toCharArray();
        int[][] memo = new int[n][];
        int[] s2CountMap = new int[n + 1];
        int s1Count = 0;
        int s2Count = 0;
        int s2Idx = 0;
        while (memo[s2Idx] == null) {
            memo[s2Idx] = new int[] {s1Count, s2Count};
            for (char c1 : ss1) {
                if (c1 == ss2[s2Idx]) {
                    s2Idx++;
                    if (s2Idx == n) {
                        s2Count++;
                        s2Idx = 0;
                    }
                }
            }
            s1Count++;
            s2CountMap[s1Count] = s2Count;
        }
        int n1Left = n1 - memo[s2Idx][0];
        int matchedPatternCount = n1Left / (s1Count - memo[s2Idx][0]) * (s2Count - memo[s2Idx][1]);
        n1Left = n1Left % (s1Count - memo[s2Idx][0]);
        int leftS2Count = s2CountMap[memo[s2Idx][0] + n1Left] - memo[s2Idx][1];
        int totalCount = leftS2Count + matchedPatternCount + memo[s2Idx][1];
        return totalCount / n2;
    }
}
