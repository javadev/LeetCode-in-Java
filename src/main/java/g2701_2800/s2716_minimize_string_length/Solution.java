package g2701_2800.s2716_minimize_string_length;

// #Easy #String #Hash_Table #2023_09_15_Time_3_ms_(100.00%)_Space_43.3_MB_(98.28%)

public class Solution {
    public int minimizedStringLength(String s) {
        int[] arr = new int[26];
        int count = 0;
        for (char c : s.toCharArray()) {
            arr[c - 'a']++;
        }
        for (int n : arr) {
            if (n != 0) {
                count++;
            }
        }
        return count;
    }
}
