package g2101_2200.s2169_count_operations_to_obtain_zero;

// #Easy #Math #Simulation #2022_06_07_Time_0_ms_(100.00%)_Space_39_MB_(96.68%)

public class Solution {
    public int countOperations(int num1, int num2) {
        int ans = 0;
        while ((num1 * num2) != 0) {
            if (num1 >= num2) {
                ans += num1 / num2;
                num1 = num1 % num2;
            } else {
                ans += num2 / num1;
                num2 = num2 % num1;
            }
        }
        return ans;
    }
}
