package g3301_3400.s3307_find_the_k_th_character_in_string_game_ii;

// #Hard #Math #Bit_Manipulation #Recursion #2024_10_01_Time_1_ms_(99.65%)_Space_43.2_MB_(59.72%)

public class Solution {
    public char kthCharacter(long k, int[] operations) {
        if (k == 1) {
            return 'a';
        }
        long len = 1;
        long newK = -1;
        int operation = -1;
        for (int ope : operations) {
            len *= 2;
            if (len >= k) {
                operation = ope;
                newK = k - len / 2;
                break;
            }
        }
        char ch = kthCharacter(newK, operations);
        if (operation == 0) {
            return ch;
        }
        return ch == 'z' ? 'a' : (char) (ch + 1);
    }
}
