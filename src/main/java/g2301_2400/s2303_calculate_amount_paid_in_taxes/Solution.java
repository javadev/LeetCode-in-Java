package g2301_2400.s2303_calculate_amount_paid_in_taxes;

// #Easy #Array #Simulation #2022_06_16_Time_1_ms_(92.41%)_Space_45.9_MB_(63.30%)

public class Solution {
    public double calculateTax(int[][] brackets, int income) {
        // you can remove this line
        if (income == 0) {
            return 0;
        }
        double sum = 0;
        double prev = 0;
        for (int i = 0; i < brackets.length; i++) {
            double salary = Math.min(brackets[i][0], income), tax = brackets[i][1];
            sum += (salary - prev) * tax;
            prev = salary;
        }
        return sum / 100;
    }
}
