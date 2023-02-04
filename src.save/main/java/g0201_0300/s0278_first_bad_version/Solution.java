package g0201_0300.s0278_first_bad_version;

// #Easy #Binary_Search #Interactive #Algorithm_I_Day_1_Binary_Search #Binary_Search_I_Day_5
// #Level_1_Day_7_Binary_Search #2022_07_06_Time_15_ms_(87.89%)_Space_39.3_MB_(85.40%)

/* The isBadVersion API is defined in the parent class VersionControl.
boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public Solution(int bad) {
        super(bad);
    }

    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (isBadVersion(mid)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
