package g0201_0300.s0278_first_bad_version;

// #Easy #Binary_Search #Interactive #Algorithm_I_Day_1_Binary_Search
// #2022_03_14_Time_12_ms_(99.50%)_Space_39_MB_(65.09%)

/* The isBadVersion API is defined in the parent class VersionControl.
boolean isBadVersion(int version); */

public class VersionControl {
    public boolean isBadVersion(int version) {
        return version % 2 == 0;
    }
}
