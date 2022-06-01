package g1801_1900.s1837_sum_of_digits_in_base_k;

// #Easy #Math #2022_05_07_Time_1_ms_(10.42%)_Space_38.9_MB_(91.55%)

public class Solution {
    public int sumBase(int n, int k) {
        String str = Integer.toString(Integer.parseInt(n + "", 10), k);
        int sum = 0;
        for (char c : str.toCharArray()) {
            sum += Character.getNumericValue(c);
        }
        return sum;
    }
}
