package g1601_1700.s1616_split_two_strings_to_make_palindrome;

// #Medium #String #Greedy #Two_Pointers #2024_09_04_Time_2_ms_(100.00%)_Space_45.1_MB_(97.99%)

@SuppressWarnings("java:S2234")
public class Solution {
    public boolean checkPalindromeFormation(String a, String b) {
        int n = a.length();
        int s = 0;
        int e = n - 1;
        if (isPalindrome(a, b, s, e, true)) {
            return true;
        } else {
            return isPalindrome(b, a, s, e, true);
        }
    }

    private boolean isPalindrome(String a, String b, int s, int e, boolean check) {
        if (s == e) {
            return true;
        }
        while (s < e) {
            if (a.charAt(s) != b.charAt(e)) {
                return check
                        && (isPalindrome(a, a, s, e, false) || isPalindrome(b, b, s, e, false));
            }
            s++;
            e--;
        }
        return true;
    }
}
