package g3401_3500.s3403_find_the_lexicographically_largest_string_from_the_box_i;

// #Medium #String #Two_Pointers #Enumeration #2025_01_06_Time_5_(89.70%)_Space_45.38_(80.39%)

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
