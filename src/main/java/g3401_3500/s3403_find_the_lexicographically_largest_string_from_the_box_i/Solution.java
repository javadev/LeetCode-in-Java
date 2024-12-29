package g3401_3500.s3403_find_the_lexicographically_largest_string_from_the_box_i;

// #Medium #2024_12_29_Time_5_(100.00%)_Space_45.20_(100.00%)

public class Solution {
    public String answerString(String word, int numFriends) {
        if (numFriends == 1) {
            return word;
        }
        int n = word.length();
        int maxlen = n - numFriends + 1;
        char maxchar = word.charAt(0);
        String res = "";
        for (int i = 0; i < n; i++) {
            if (word.charAt(i) >= maxchar) {
                String curr = word.substring(i, Math.min(i + maxlen, n));
                if (curr.compareTo(res) > 0) {
                    res = curr;
                }
                maxchar = word.charAt(i);
            }
        }
        return res;
    }
}
