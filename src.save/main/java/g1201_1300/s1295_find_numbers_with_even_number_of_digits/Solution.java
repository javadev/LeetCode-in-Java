package g1201_1300.s1295_find_numbers_with_even_number_of_digits;

// #Easy #Array #2022_03_10_Time_2_ms_(58.23%)_Space_43.7_MB_(23.87%)

public class Solution {
    public int findNumbers(int[] nums) {
        // initialising variable to hold number of digits and numbers having even number of digits
        int digitCount = 0;
        int evendigitCount = 0;
        // traversing through the array
        for (int i : nums) {
            while (i != 0) {
                // counting digits for each number
                digitCount++;
                i = i / 10;
            }
            // incrementing variable for numbers having even number of digits
            if (digitCount % 2 == 0) {
                evendigitCount++;
            }
            // reassigning the value to reset digits for next number in iteration
            digitCount = 0;
        }
        return evendigitCount;
    }
}
