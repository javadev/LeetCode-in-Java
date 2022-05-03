package g1801_1900.s1813_sentence_similarity_iii;

// #Medium #Array #String #Two_Pointers #2022_05_03_Time_3_ms_(40.12%)_Space_42.3_MB_(43.02%)

public class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        String shorter = sentence1.length() < sentence2.length() ? sentence1 : sentence2;
        String longer = shorter.equals(sentence1) ? sentence2 : sentence1;
        String[] shortWords = shorter.split(" ");
        String[] longWords = longer.split(" ");
        int breaks = 0;
        int j = 0;
        int i = 0;
        while (i < shortWords.length && j < longWords.length) {
            if (shortWords[i].equals(longWords[j])) {
                j++;
                i++;
            } else {
                breaks++;
                if (breaks > 1) {
                    break;
                }
                while (j < longWords.length && !longWords[j].equals(shortWords[i])) {
                    j++;
                }
            }
        }
        if ((breaks == 1 && i == shortWords.length && j == longWords.length)
                || (i == shortWords.length && breaks == 0)) {
            return true;
        }
        i = shortWords.length - 1;
        j = longWords.length - 1;
        breaks = 0;
        while (i >= 0 && j >= 0) {
            if (shortWords[i].equals(longWords[j])) {
                i--;
                j--;
            } else {
                breaks++;
                if (breaks > 1) {
                    return false;
                }
                while (j >= 0 && !longWords[j].equals(shortWords[i])) {
                    j--;
                }
            }
        }
        return (breaks == 1 && i == -1 && j == -1) || (breaks == 0 && i == -1);
    }
}
