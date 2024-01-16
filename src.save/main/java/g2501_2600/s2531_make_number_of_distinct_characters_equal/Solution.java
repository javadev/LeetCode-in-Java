package g2501_2600.s2531_make_number_of_distinct_characters_equal;

// #Medium #String #Hash_Table #Counting #2023_04_20_Time_7_ms_(100.00%)_Space_43_MB_(96.82%)

@SuppressWarnings("java:S135")
public class Solution {
    public boolean isItPossible(String word1, String word2) {
        int[] count1 = count(word1);
        int[] count2 = count(word2);
        int d = count1[26] - count2[26];
        int[] zip1 = zip(count1, count2);
        int[] zip2 = zip(count2, count1);
        for (int i = 0; i < 26; i++) {
            int d1 = zip1[i];
            if (d1 == -1) {
                continue;
            }
            for (int j = 0; j < 26; j++) {
                int d2 = zip2[j];
                if (d2 == -1) {
                    continue;
                }
                if (i == j) {
                    if (d == 0) {
                        return true;
                    }
                    continue;
                }
                if (d - d1 + d2 == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    private int[] zip(int[] c1, int[] c2) {
        int[] zip = new int[26];
        for (int i = 0; i < 26; i++) {
            int d = 0;
            if (c1[i] == 0) {
                d = -1;
            } else {
                if (c2[i] == 0) {
                    d++;
                }
                if (c1[i] == 1) {
                    d++;
                }
            }
            zip[i] = d;
        }
        return zip;
    }

    private int[] count(String word) {
        int[] count = new int[27];
        int len = word.length();
        for (int i = 0; i < len; i++) {
            count[word.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                count[26]++;
            }
        }
        return count;
    }
}
