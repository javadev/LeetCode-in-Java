package g1901_2000.s1963_minimum_number_of_swaps_to_make_the_string_balanced;

// #Medium #String #Greedy #Two_Pointers #Stack #2022_05_21_Time_17_ms_(93.71%)_Space_50_MB_(91.93%)

public class Solution {
    public int minSwaps(String s) {
        int openCount = 0;
        int swap = 0;
        for (char c : s.toCharArray()) {
            if (c == '[') {
                openCount++;
            } else {
                if (openCount == 0) {
                    swap++;
                    openCount++;
                } else {
                    openCount--;
                }
            }
        }
        return swap;
    }
}
