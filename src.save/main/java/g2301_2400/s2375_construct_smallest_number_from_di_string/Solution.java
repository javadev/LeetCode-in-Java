package g2301_2400.s2375_construct_smallest_number_from_di_string;

// #Medium #String #Greedy #Stack #Backtracking
// #2022_08_19_Time_0_ms_(100.00%)_Space_40.2_MB_(98.07%)

public class Solution {
    public String smallestNumber(String pattern) {
        int[] ret = new int[pattern.length() + 1];
        ret[0] = 1;
        int max = 2;
        int lastI = 0;
        for (int i = 0; i < pattern.length(); i++) {
            if (pattern.charAt(i) == 'I') {
                ret[i + 1] = max++;
                lastI = i + 1;
            } else {
                for (int j = i; j >= lastI; j--) {
                    ret[j + 1] = ret[j];
                }
                ret[lastI] = max++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i : ret) {
            sb.append(i);
        }
        return sb.toString();
    }
}
