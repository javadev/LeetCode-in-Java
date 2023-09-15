package g2701_2800.s2785_sort_vowels_in_a_string;

// #Medium #String #Sorting #2023_09_15_Time_5_ms_(100.00%)_Space_44.6_MB_(96.53%)

public class Solution {
    public String sortVowels(String s) {
        int[] vowelCount = new int[11];
        int[] countIndexMap = new int[128];
        char[] result = s.toCharArray();
        char[] charMap = "AEIOUaeiou".toCharArray();
        for (int i = 0; i < charMap.length; i++) {
            countIndexMap[charMap[i]] = i + 1;
        }
        for (char c : result) {
            vowelCount[countIndexMap[c]]++;
        }
        int j = 1;
        int i = 0;
        while (j < vowelCount.length) {
            if (vowelCount[j] > 0) {
                while (i < result.length) {
                    if (countIndexMap[result[i]] == 0) {
                        i++;
                    } else {
                        vowelCount[j]--;
                        result[i++] = charMap[j - 1];
                        break;
                    }
                }
            } else {
                j++;
            }
        }
        return new String(result);
    }
}
