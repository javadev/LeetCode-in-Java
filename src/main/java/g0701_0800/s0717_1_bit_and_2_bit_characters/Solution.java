package g0701_0800.s0717_1_bit_and_2_bit_characters;

// #Easy #Array

public class Solution {
    public boolean isOneBitCharacter(int[] arr) {
        int i = 0;
        while (i < arr.length - 1) {
            i = (arr[i] == 1) ? i + 2 : i + 1;
        }
        return (i == arr.length - 1);
    }
}
