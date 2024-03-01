package g2201_2300.s2287_rearrange_characters_to_make_target_string;

// #Easy #String #Hash_Table #Counting #2022_06_17_Time_1_ms_(87.39%)_Space_41.6_MB_(79.37%)

public class Solution {
    public int rearrangeCharacters(String s, String target) {
        return getMaxCopies(target, getCharCount(s), getCharCount(target));
    }

    private int[] getCharCount(String str) {
        int[] charToCount = new int[26];
        for (int i = 0; i < str.length(); i++) {
            charToCount[str.charAt(i) - 'a']++;
        }
        return charToCount;
    }

    private int getMaxCopies(String target, int[] sCount, int[] tCount) {
        int copies = Integer.MAX_VALUE;
        for (int i = 0; i < target.length(); i++) {
            int ch = target.charAt(i) - 'a';
            copies = Math.min(copies, sCount[ch] / tCount[ch]);
        }
        return copies;
    }
}
