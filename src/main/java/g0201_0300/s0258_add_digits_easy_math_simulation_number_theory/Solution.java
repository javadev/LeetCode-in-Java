package g0201_0300.s0258_add_digits_easy_math_simulation_number_theory;

public class Solution {
    public int addDigits(int num) {
        if (num == 0) {
            return 0;
        }
        if (num % 9 == 0) {
            return 9;
        }
        return num % 9;
    }
}
