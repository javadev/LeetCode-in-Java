package g1801_1900.s1899_merge_triplets_to_form_target_triplet;

// #Medium #Array #Greedy #2022_05_04_Time_1_ms_(98.96%)_Space_134_MB_(50.26%)

public class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        boolean one = false;
        boolean two = false;
        boolean three = false;
        for (int[] triplet : triplets) {
            if (!one
                    && triplet[0] == target[0]
                    && triplet[1] <= target[1]
                    && triplet[2] <= target[2]) {
                one = true;
            }
            if (!two
                    && triplet[0] <= target[0]
                    && triplet[1] == target[1]
                    && triplet[2] <= target[2]) {
                two = true;
            }
            if (!three
                    && triplet[0] <= target[0]
                    && triplet[1] <= target[1]
                    && triplet[2] == target[2]) {
                three = true;
            }
            if (one && two && three) {
                return true;
            }
        }
        return false;
    }
}
