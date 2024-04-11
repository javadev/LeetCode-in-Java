package g3101_3200.s3106_lexicographically_smallest_string_after_operations_with_constraint;

// #Medium #String #Greedy #2024_04_11_Time_1_ms_(100.00%)_Space_42.4_MB_(91.10%)

public class Solution {
    public String getSmallestString(String s, int k) {
        char[] sArray = s.toCharArray();
        for (int i = 0; i < sArray.length; i++) {
            int distToA = cyclicDistance(sArray[i], 'a');
            if (distToA <= k) {
                sArray[i] = 'a';
                k -= distToA;
            } else if (k > 0) {
                sArray[i] = (char) (sArray[i] - k);
                k = 0;
            }
        }
        return new String(sArray);
    }

    private int cyclicDistance(char ch1, char ch2) {
        int dist = Math.abs(ch1 - ch2);
        return Math.min(dist, 26 - dist);
    }
}
