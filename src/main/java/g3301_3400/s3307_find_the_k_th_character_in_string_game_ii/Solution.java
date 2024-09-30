package g3301_3400.s3307_find_the_k_th_character_in_string_game_ii;

// #Hard #2024_09_30_Time_1_ms_(100.00%)_Space_43.4_MB_(100.00%)

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
