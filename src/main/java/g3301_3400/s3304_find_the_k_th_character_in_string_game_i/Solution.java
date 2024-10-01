package g3301_3400.s3304_find_the_k_th_character_in_string_game_i;

// #Easy #Math #Bit_Manipulation #Simulation #Recursion
// #2024_10_01_Time_0_ms_(100.00%)_Space_41.2_MB_(99.17%)

public class Solution {
    public char kthCharacter(int k) {
        // Initialize the length of the current string
        // Initial length when word = "a"
        int length = 1;

        // Find the total length after enough iterations
        while (length < k) {
            length *= 2;
        }
        // Trace back to the original character
        // Start with 'a'
        char currentChar = 'a';
        while (length > 1) {
            length /= 2;
            if (k > length) {
                // Adjust k for the next character
                k -= length;
                // Move to the next character
                currentChar++;
                if (currentChar > 'z') {
                    // Wrap around if exceeds 'z'
                    currentChar = 'a';
                }
            }
        }
        return currentChar;
    }
}
