package g2101_2200.s2193_minimum_number_of_moves_to_make_palindrome;

// #Hard #String #Greedy #Two_Pointers #Binary_Indexed_Tree
// #2022_06_02_Time_8_ms_(98.76%)_Space_40.8_MB_(96.27%)

public class Solution {
    //rename method/variable refactoring technique
    public int minMovesToMakePalindrome(String givenString) {
        int left = 0;
        int right = givenString.length() - 1;
        char[] characterArray = givenString.toCharArray();
        int numberOfMoves = 0;
        while (left < right) {
            if (characterArray[left] != characterArray[right]) {
                char previous = characterArray[left];
                int matchingCharacterIndex = right;
                while (characterArray[matchingCharacterIndex] != previous) {
                    matchingCharacterIndex--;
                }
                // middle element
                if (matchingCharacterIndex == left) {
                    char flagCharacter = characterArray[left];
                    characterArray[left] = characterArray[left + 1];
                    characterArray[left + 1] = flagCharacter;
                    numberOfMoves++;
                    continue;
                }
                for (int i = matchingCharacterIndex; i < right; i++) {
                    char flagCharacter = characterArray[i];
                    characterArray[i] = characterArray[i + 1];
                    characterArray[i + 1] = flagCharacter;
                    numberOfMoves++;
                }
            }
            left++;
            right--;
        }
        return numberOfMoves;
    }
}
