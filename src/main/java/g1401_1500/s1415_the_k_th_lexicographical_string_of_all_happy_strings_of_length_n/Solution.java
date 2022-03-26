package g1401_1500.s1415_the_k_th_lexicographical_string_of_all_happy_strings_of_length_n;

// #Medium #String #Backtracking #2022_03_26_Time_2_ms_(89.96%)_Space_40.8_MB_(91.57%)

public class Solution {
    public String getHappyString(int n, int k) {
        int finalLength = (int) (3 * Math.pow(2, n - 1));
        StringBuilder res = new StringBuilder();
        if (k > finalLength) {
            return "";
        }
        k--;
        int previousCall = -1;
        int calls = 3;
        for (int i = 0; i < n; i++) {
            int parts = finalLength / calls;
            int currentCall = k / parts;
            if (currentCall == 0) {
                if (previousCall == 0) {
                    previousCall = 1;
                } else {
                    previousCall = 0;
                }
            } else if (currentCall == 1) {
                if (previousCall == -1 || previousCall == 2) {
                    previousCall = 1;
                } else {
                    previousCall = 2;
                }
            } else {
                previousCall = 2;
            }
            calls = 2;
            res.append((char) ('a' + previousCall));
            finalLength = parts;
            k -= (currentCall * parts);
        }
        return res.toString();
    }
}
