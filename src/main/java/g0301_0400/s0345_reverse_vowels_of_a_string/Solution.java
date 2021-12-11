package g0301_0400.s0345_reverse_vowels_of_a_string;

class Solution {
    static boolean isVowel(char c) {
        return (c == 'a' || c == 'A' || c == 'e'
                || c == 'E' || c == 'i' || c == 'I'
                || c == 'o' || c == 'O' || c == 'u'
                || c == 'U');
    }

    public String reverseVowels(String str) {
        int i = 0;
        int j = str.length() - 1;
        char[] str1 = str.toCharArray();
        while (i < j) {
            if (!isVowel(str1[i])) {
                i++;
                continue;
            }
            if (!isVowel(str1[j])) {
                j--;
                continue;
            }

            // swapping
            char t = str1[i];
            str1[i] = str1[j];
            str1[j] = t;


            i++;
            j--;
        }
        return String.copyValueOf(str1);

    }
}