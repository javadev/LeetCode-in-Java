package g2001_2100.s2032_two_out_of_three;

// #Easy #Array #Hash_Table #2022_05_25_Time_9_ms_(45.56%)_Space_47.4_MB_(38.52%)

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> ans = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }
        Set<Integer> set2 = new HashSet<>();
        for (int i : nums2) {
            set2.add(i);
        }
        Set<Integer> set3 = new HashSet<>();
        for (int i : nums3) {
            set3.add(i);
        }
        for (int j : nums1) {
            if (set2.contains(j) || set3.contains(j)) {
                ans.add(j);
            }
        }
        for (int j : nums2) {
            if (set1.contains(j) || set3.contains(j)) {
                ans.add(j);
            }
        }
        for (int j : nums3) {
            if (set1.contains(j) || set2.contains(j)) {
                ans.add(j);
            }
        }
        List<Integer> result = new ArrayList<>();
        result.addAll(ans);
        return result;
    }
}
