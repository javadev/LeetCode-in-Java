package g0701_0800.s0791_custom_sort_string;

// #Medium #String #Hash_Table #Sorting #2022_03_26_Time_1_ms_(78.82%)_Space_42.1_MB_(48.16%)

public class Solution {
    public String customSortString(String order, String s) {
        int[] ord = new int[26];
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            ord[c - 'a']++;
        }
        for (char c : order.toCharArray()) {
            while (ord[c - 'a']-- > 0) {
                sb.append(c);
            }
        }
        for (char c : s.toCharArray()) {
            while (ord[c - 'a']-- > 0) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
