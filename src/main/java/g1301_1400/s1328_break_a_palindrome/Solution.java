package g1301_1400.s1328_break_a_palindrome;

// #Medium #String #Greedy #2022_03_19_Time_0_ms_(100.00%)_Space_42.3_MB_(21.67%)

public class Solution {
    public String breakPalindrome(String palindrome) {
        if (palindrome.length() <= 1) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < palindrome.length(); i++) {
            char ch = palindrome.charAt(i);
            if (ch != 'a' && i != palindrome.length() - 1 - i) {
                sb.append('a');
                sb.append(palindrome.substring(i + 1));
                return sb.toString();
            } else {
                sb.append(ch);
            }
        }
        sb.deleteCharAt(palindrome.length() - 1);
        sb.append('b');
        return sb.toString();
    }
}
