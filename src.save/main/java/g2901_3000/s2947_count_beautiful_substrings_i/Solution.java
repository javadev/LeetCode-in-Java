package g2901_3000.s2947_count_beautiful_substrings_i;

// #Medium #String #Prefix_Sum #Enumeration #2023_12_26_Time_2_ms_(100.00%)_Space_42.4_MB_(15.02%)

public class Solution {
    public int beautifulSubstrings(String s, int k) {
        int[] numVowels = new int[s.length() + 1];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                numVowels[i + 1] = numVowels[i] + 1;
            } else {
                numVowels[i + 1] = numVowels[i];
            }
        }
        int step = 1;
        while (step < k) {
            if ((step * step) % k == 0) {
                break;
            }
            step++;
        }
        step = step * 2;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + step; j <= s.length(); j += step) {
                if ((numVowels[j] - numVowels[i]) * 2 == j - i) {
                    count++;
                }
            }
        }
        return count;
    }
}
