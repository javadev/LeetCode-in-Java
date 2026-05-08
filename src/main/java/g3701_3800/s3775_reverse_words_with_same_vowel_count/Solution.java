package g3701_3800.s3775_reverse_words_with_same_vowel_count;

// #Medium #String #Two_Pointers #Simulation #Senior #Weekly_Contest_480
// #2026_05_08_Time_41_ms_(96.14%)_Space_48.30_MB_(90.84%)

public class Solution {
    public String reverseWords(String s) {
        char[] wrd = s.toCharArray();
        String vowels = "aeiou";
        int left = 0;
        int right = 0;
        int firstWrd = 0;
        int anotherWrd = 0;
        while (left < wrd.length) {
            right = left;
            anotherWrd = 0;
            while (right < wrd.length && wrd[right] != ' ') {
                if (vowels.indexOf(wrd[right]) != -1) {
                    if (left == 0) {
                        firstWrd++;
                    } else {
                        anotherWrd++;
                    }
                }
                right++;
            }
            if (left != 0 && anotherWrd == firstWrd) {
                int l = left;
                int r = right - 1;
                while (l < r) {
                    char temp = wrd[r];
                    wrd[r--] = wrd[l];
                    wrd[l++] = temp;
                }
            }
            left = right + 1;
        }
        return new String(wrd);
    }
}
