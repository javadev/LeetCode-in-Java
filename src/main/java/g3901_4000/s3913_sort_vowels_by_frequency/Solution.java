package g3901_4000.s3913_sort_vowels_by_frequency;

// #Medium #String #Sorting #Counting #Senior #Weekly_Contest_499
// #2026_09_17_Time_9_ms_(100.00%)_Space_47.32_MB_(89.74%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String sortVowels(String s) {
        int[] freq = new int[26];
        char[] ch = s.toCharArray();
        for (char c : ch) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                freq[c - 'a']++;
            }
        }
        List<int[]> x = new ArrayList<>();
        for (int i = 0; i < 26 ; i++) {
            if (freq[i] > 0) {
                x.add(new int[] {i, freq[i]});
            }
        }
        x.sort((a,b) -> b[1] - a[1] == 0 ? s.indexOf((char) (a[0] + 'a')) - s.indexOf((char) (b[0] +'a')) : b[1] - a[1]);
        int i = 0;
        for (int[] f : x) {
            while (f[1] > 0) {
                char c = ch[i];
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    ch[i] = (char) (f[0] + 'a');
                    f[1]--;
                }
                i++;
            }
        }
        return new String(ch);
    }
}

