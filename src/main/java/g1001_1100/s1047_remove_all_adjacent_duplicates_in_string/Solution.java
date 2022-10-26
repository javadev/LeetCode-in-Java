package g1001_1100.s1047_remove_all_adjacent_duplicates_in_string;

// #Easy #String #Stack #2022_02_28_Time_3_ms_(99.99%)_Space_42.7_MB_(84.52%)

public class Solution {
    public String removeDuplicates(String s) {
        if (s.length() == 1) {
            return s;
        }
        char[] array = s.toCharArray();
        int length = array.length;
        int fast = 0;
        int slow = 0;
        while (fast < length) {
            if (slow == 0 || array[fast] != array[slow - 1]) {
                array[slow++] = array[fast++];
            } else {
                if (array[fast] == array[slow - 1]) {
                    fast++;
                }
                slow--;
            }
        }
        return new String(array, 0, slow);
    }
}
