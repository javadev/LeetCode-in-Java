package g1901_2000.s1915_number_of_wonderful_substrings;

// #Medium #String #Hash_Table #Bit_Manipulation #Prefix_Sum
// #2022_05_14_Time_31_ms_(82.46%)_Space_54.6_MB_(38.60%)

public class Solution {
    public long wonderfulSubstrings(String word) {
        int[] count = new int[1024];
        long res = 0;
        int cur = 0;
        count[0] = 1;
        for (int i = 0; i < word.length(); i++) {
            cur ^= 1 << (word.charAt(i) - 'a');
            res += count[cur];
            for (int j = 0; j < 10; j++) {
                res += count[cur ^ (1 << j)];
            }
            ++count[cur];
        }
        return res;
    }
}
