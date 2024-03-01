package g3001_3100.s3019_number_of_changing_keys;

// #Easy #String #Breadth_First_Search #Graph #Prefix_Sum
// #2024_02_28_Time_1_ms_(99.99%)_Space_42_MB_(80.19%)

public class Solution {
    public int countKeyChanges(String s) {
        s = s.toLowerCase();
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                count++;
            }
        }
        return count;
    }
}
