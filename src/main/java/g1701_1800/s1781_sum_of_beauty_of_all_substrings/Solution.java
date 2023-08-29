package g1701_1800.s1781_sum_of_beauty_of_all_substrings;

// #Medium #String #Hash_Table #Counting #2022_04_27_Time_38_ms_(100.00%)_Space_51.4_MB_(22.14%)

public class Solution {
    public int beautySum(String s) {
        int beauty = 0;
        for (int i = 0; i < s.length(); i++) {
            int[] numCountOfFreq = new int[s.length() + 1 - i];
            int[] charFreq = new int[26];
            charFreq[s.charAt(i) - 'a'] = 1;
            numCountOfFreq[1] = 1;
            int min = 1;
            int max = 1;
            for (int j = i + 1; j < s.length(); j++) {
                char c = s.charAt(j);
                charFreq[c - 'a']++;
                int freq = charFreq[c - 'a'];
                numCountOfFreq[freq - 1]--;
                numCountOfFreq[freq]++;
                if (numCountOfFreq[min] == 0) {
                    min++;
                }
                if (min > freq) {
                    min = freq;
                }
                if (max < freq) {
                    max = freq;
                }
                beauty += max - min;
            }
        }
        return beauty;
    }
}
