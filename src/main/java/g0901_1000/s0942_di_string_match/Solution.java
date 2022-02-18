package g0901_1000.s0942_di_string_match;

// #Easy #Array #String #Math #Greedy #Two_Pointers
// #2022_02_18_Time_2_ms_(98.58%)_Space_42.9_MB_(70.22%)

public class Solution {

    public int[] diStringMatch(String s) {
        int[] arr = new int[s.length() + 1];
        int max = s.length();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'D') {
                arr[i] = max;
                max--;
            }
        }
        for (int i = s.length() - 1; i >= 0 && max > 0; i--) {
            if (s.charAt(i) == 'I' && arr[i + 1] == 0) {
                arr[i + 1] = max;
                max--;
            }
        }
        for (int i = 0; i < arr.length && max > 0; i++) {
            if (arr[i] == 0) {
                arr[i] = max;
                max--;
            }
        }

        return arr;
    }
}
