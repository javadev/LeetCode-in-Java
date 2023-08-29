package g1801_1900.s1855_maximum_distance_between_a_pair_of_values;

// #Medium #Array #Greedy #Binary_Search #Two_Pointers #Binary_Search_I_Day_11
// #2022_05_08_Time_4_ms_(62.20%)_Space_102.5_MB_(38.31%)

public class Solution {
    public int maxDistance(int[] n1, int[] n2) {
        int n = n1.length;
        int m = n2.length;
        int po1 = 0;
        int po2 = 0;
        int res = 0;
        while (po1 < n && po2 < m) {
            if (n1[po1] > n2[po2]) {
                po1++;
            } else {
                if (po2 != po1) {
                    res = Math.max(res, po2 - po1);
                }
                po2++;
            }
        }
        return res;
    }
}
