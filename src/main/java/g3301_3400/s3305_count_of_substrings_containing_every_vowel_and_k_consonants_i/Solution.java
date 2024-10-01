package g3301_3400.s3305_count_of_substrings_containing_every_vowel_and_k_consonants_i;

// #Medium #String #Hash_Table #Sliding_Window #2024_10_01_Time_2_ms_(99.72%)_Space_42.2_MB_(98.48%)

public class Solution {
    public int countOfSubstrings(String word, int k) {
        char[] arr = word.toCharArray();
        int[] map = new int[26];
        map['a' - 'a']++;
        map['e' - 'a']++;
        map['i' - 'a']++;
        map['o' - 'a']++;
        map['u' - 'a']++;
        int need = 5;
        int ans = 0;
        int consCnt = 0;
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            while (j < arr.length && (need > 0 || consCnt < k)) {
                if (isVowel(arr[j])) {
                    map[arr[j] - 'a']--;
                    if (map[arr[j] - 'a'] == 0) {
                        need--;
                    }
                } else {
                    consCnt++;
                }
                j++;
            }
            if (need == 0 && consCnt == k) {
                ans++;
                int m = j;
                while (m < arr.length) {
                    if (isVowel(arr[m])) {
                        ans++;
                    } else {
                        break;
                    }
                    m++;
                }
            }
            if (isVowel(arr[i])) {
                map[arr[i] - 'a']++;
                if (map[arr[i] - 'a'] == 1) {
                    need++;
                }
            } else {
                consCnt--;
            }
        }
        return ans;
    }

    private boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        }
        return false;
    }
}
