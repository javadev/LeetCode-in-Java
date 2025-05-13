package g3501_3600.s3541_find_most_frequent_vowel_and_consonant;

// #Easy #String #Hash_Table #Counting #2025_05_13_Time_1_ms_(100.00%)_Space_42.55_MB_(70.83%)

public class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            int index = ch - 'a';
            freq[index]++;
        }
        String si = "aeiou";
        int max1 = 0;
        int max2 = 0;
        for (int i = 0; i < 26; i++) {
            char ch = (char) (i + 'a');
            if (si.indexOf(ch) != -1) {
                max1 = Math.max(max1, freq[i]);
            } else {
                max2 = Math.max(max2, freq[i]);
            }
        }
        return max1 + max2;
    }
}
