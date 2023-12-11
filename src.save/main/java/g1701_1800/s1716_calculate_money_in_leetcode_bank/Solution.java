package g1701_1800.s1716_calculate_money_in_leetcode_bank;

// #Easy #Math #2022_04_24_Time_1_ms_(65.33%)_Space_41.7_MB_(7.74%)

public class Solution {
    public int totalMoney(int n) {
        int mondayMoney = 1;
        int total = 0;
        while (n > 0) {
            int weekDays = 0;
            int base = mondayMoney;
            while (weekDays < 7 && n > 0) {
                total += base;
                base++;
                weekDays++;
                n--;
            }
            mondayMoney++;
        }
        return total;
    }
}
